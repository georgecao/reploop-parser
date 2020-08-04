package org.reploop.translator.json.support;

import com.google.common.collect.ImmutableList;
import org.reploop.parser.QualifiedName;
import org.reploop.parser.protobuf.tree.*;
import org.reploop.translator.json.bean.JsonFieldTypeResolver;
import org.reploop.translator.json.bean.JsonMessageContext;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.stream.Collectors.toList;
import static org.reploop.translator.json.support.TypeSupport.customTypeName;
import static org.reploop.translator.json.support.Constants.ABSTRACT_ATTR;
import static org.reploop.translator.json.support.Constants.EXTENDS_ATTR;

/**
 * Try to analyze class hierarchy to avoid duplicated classes.
 */
public class ClassHierarchy {

    private final JsonFieldTypeResolver fieldTypeResolver;

    public ClassHierarchy() {
        this(new JsonFieldTypeResolver());
    }

    public ClassHierarchy(JsonFieldTypeResolver fieldTypeResolver) {
        this.fieldTypeResolver = fieldTypeResolver;
    }

    private void index(Map<QualifiedName, Message> messageMap,
                       Map<QualifiedName, Integer> nameIndexMap, Map<Integer, QualifiedName> indexNameMap,
                       Map<Field, Integer> fieldIndexMap, Map<Integer, Field> indexFieldMap) {
        AtomicInteger mi = new AtomicInteger(0);
        AtomicInteger fi = new AtomicInteger(0);
        for (Map.Entry<QualifiedName, Message> entry : messageMap.entrySet()) {
            QualifiedName key = entry.getKey();
            nameIndexMap.computeIfAbsent(key, name -> mi.getAndIncrement());
            indexNameMap.put(nameIndexMap.get(key), key);
            Message message = entry.getValue();
            List<Field> fields = message.getFields();
            for (Field field : fields) {
                fieldIndexMap.computeIfAbsent(field, value -> fi.getAndIncrement());
                indexFieldMap.put(fieldIndexMap.get(field), field);
            }
        }
    }

    private int[][] init(int messageCount, int fieldCount) {
        int fc = fieldCount + 1;
        int mc = messageCount + 1;
        int[][] matrix = new int[fc][mc];
        for (int f = 0; f < fc; f++) {
            for (int m = 0; m < mc; m++) {
                matrix[f][m] = 0;
            }
        }
        return matrix;
    }

    public void infer(Map<QualifiedName, Message> messageMap) {
        Map<QualifiedName, Integer> nameIndexMap = new HashMap<>();
        Map<Integer, QualifiedName> indexNameMap = new HashMap<>();
        Map<Field, Integer> fieldIndexMap = new HashMap<>();
        Map<Integer, Field> indexFieldMap = new HashMap<>();
        // message and field name to index
        index(messageMap, nameIndexMap, indexNameMap, fieldIndexMap, indexFieldMap);

        // data matrix size
        int ms = nameIndexMap.size();
        int fs = fieldIndexMap.size();

        // actual matrix size
        int mc = ms + 1;
        int fc = fs + 1;

        // init matrix
        int[][] matrix = init(messageMap, nameIndexMap, fieldIndexMap);
        // sum rows and columns
        for (int i = 0; i < fs; i++) {
            for (int j = 0; j < ms; j++) {
                matrix[i][ms] += matrix[i][j];
                matrix[fs][j] += matrix[i][j];
            }
        }
        // sort matrix
        sort(nameIndexMap, indexNameMap, fieldIndexMap, indexFieldMap, ms, fs, mc, fc, matrix);
        // print out
        print(ms, fs, matrix);
        // generate parent message
        Map<QualifiedName, QualifiedName> same = infer(messageMap, indexNameMap, indexFieldMap, ms, fs, matrix);
        System.out.println(same);

    }

    private boolean hasCommon(Point p1, Point p2) {
        return p1.y - p2.y != 0 && p1.x - p2.x != 0;
    }

    private boolean hasCommon(Rect rect) {
        return hasCommon(rect.lt, rect.rb);
    }

    private final Comparator<Message> messageComparator = (o1, o2) -> o2.getName().compareTo(o1.getName());

    private Map<QualifiedName, QualifiedName> infer(Map<QualifiedName, Message> messageMap,
                                                    Map<Integer, QualifiedName> indexNameMap,
                                                    Map<Integer, Field> indexFieldMap,
                                                    int ms, int fs, int[][] matrix) {
        Map<QualifiedName, QualifiedName> same = new HashMap<>();
        // calculate max rect
        Optional<Rect> or = maxArea(matrix, fs, ms);
        Rect rect;
        if (or.isPresent() && hasCommon(rect = or.get())) {
            // Fields may be in parent class
            Set<Field> fields = new HashSet<>();
            for (int f = rect.lt.x; f <= rect.rb.x; f++) {
                Field field = indexFieldMap.get(f);
                fields.add(field);
            }
            // Messages may be have common parent class
            TreeMap<Message, Integer> messageIndexMap = new TreeMap<>(messageComparator);
            for (int m = rect.lt.y; m <= rect.rb.y; m++) {
                QualifiedName qn = indexNameMap.get(m);
                Message message = messageMap.get(qn);
                messageIndexMap.put(message, m);
            }
            // Message will extend the parent
            Message parent = null;
            QualifiedName name;

            List<Message> subClasses = new ArrayList<>();
            for (Map.Entry<Message, Integer> entry : messageIndexMap.entrySet()) {
                Message message = entry.getKey();
                QualifiedName qn = message.getName();
                List<Field> sub = message.getFields().stream()
                    .filter(field -> !fields.contains(field))
                    .collect(toList());
                // Same as parent, we make this message as parent  without modifying it's name.
                if (sub.isEmpty()) {
                    if (null == parent) {
                        parent = message;
                    } else {
                        // They are same, replace them with parent class.
                        same.put(qn, parent.getName());
                    }
                } else {
                    Message child = new Message(qn, message.getComments(), sub, message.getMessages(), message.getEnumerations(), message.getOptions());
                    subClasses.add(child);
                    // Update the message
                    messageMap.put(qn, child);
                }
            }
            if (null == parent) {
                name = parentName(messageIndexMap.firstKey(), rect);
                // Add options
                List<Option> ops = new ArrayList<>();
                ops.add(new CommonPair(ABSTRACT_ATTR, new BoolValue(true)));
                parent = new Message(name, new ArrayList<>(fields), Collections.emptyList(), Collections.emptyList(), ops);
            } else {
                name = parent.getName();
            }
            List<Message> messages = parent.getMessages();
            if (null != messages) {
                subClasses.addAll(messages);
            }
            if (subClasses.size() > 0) {
                // Add options
                for (Message message : subClasses) {
                    List<Option> ops = new ArrayList<>();
                    ops.add(new CommonPair(EXTENDS_ATTR, new StringValue(name.toString())));
                    List<Option> options = message.getOptions();
                    if (null != options) {
                        ops.addAll(options);
                    }
                    Message m = new Message(message.getName(), message.getComments(), message.getFields(), message.getMessages(), message.getEnumerations(), ops);
                    messageMap.put(m.getName(), m);
                }

                // If parent and subclasses are same actually, we eliminate some useless entities.
                reduce(parent, subClasses, messageMap, same);
            }

            // Rewrite same entities
            if (same.size() > 0) {
                rewrite(messageMap, same);
            }
            messageMap.put(name, parent);
        }
        return same;
    }

    private QualifiedName parentName(Message message, Rect rect) {
        QualifiedName qn = message.getName();
        StringBuilder sb = new StringBuilder(qn.suffix());
        for (int m = rect.lt.y; m <= rect.rb.y; m++) {
            sb.append(m);
        }
        return QualifiedName.of(qn.prefix(), sb.toString());
    }

    private void rewrite(Map<QualifiedName, Message> messageMap, Map<QualifiedName, QualifiedName> identityNames) {
        JsonMessageContext context = new JsonMessageContext();
        context.addIdentityNames(identityNames);
        messageMap.forEach((name, message) -> {
            Message msg = fieldTypeResolver.visitMessage(message, context);
            messageMap.put(msg.getName(), msg);
        });
    }

    private void reduce(Message parent,
                        List<Message> subClasses,
                        Map<QualifiedName, Message> messageMap,
                        Map<QualifiedName, QualifiedName> sameMap) {
        List<Message> messages = subClasses.stream().sorted((o1, o2) -> o2.getName().compareTo(o1.getName())).collect(toList());
        JsonMessageContext ctx = new JsonMessageContext();
        ctx.addIdentityNames(sameMap);
        for (Message message : messages) {
            Message msg = fieldTypeResolver.visitMessage(message, ctx);
            Optional<Message> om = reduce(parent, msg, messageMap, ctx);
            if (om.isPresent()) {
                parent = om.get();
            }
        }
    }

    private Optional<Message> reduce(Message parent, Message message,
                                     Map<QualifiedName, Message> messageMap, JsonMessageContext context) {
        List<Field> fields = message.getFields();
        if (null == fields || fields.size() != 1) {
            return Optional.empty();
        }
        // The only field
        Field field = fields.get(0);
        Optional<QualifiedName> oq = customTypeName(field.getType());
        // A class has only one field and the field's type is same as it's parent, then we consider this class can be parent.
        boolean same = oq.filter(qn -> qn.equals(parent.getName())).isPresent();
        if (same) {
            JsonMessageContext ctx = new JsonMessageContext(message.getName());
            ctx.addIdentityName(parent.getName(), message.getName());
            List<Field> merge = ImmutableList.<Field>builder()
                .add(field)
                .addAll(parent.getFields())
                .build();
            List<Field> list = merge.stream().map(f -> fieldTypeResolver.visitField(f, ctx)).distinct().collect(toList());
            Message msg = new Message(message.getName(), message.getComments(), list, message.getMessages(), message.getEnumerations(), message.getOptions());
            messageMap.put(msg.getName(), msg);

            // Parent is same as this message after fields merging.
            context.addIdentityName(parent.getName(), message.getName());
            return Optional.of(msg);
        }
        return Optional.empty();
    }

    private void print(int ms, int fs, int[][] matrix) {
        System.out.printf("%3d", 0);
        for (int j = 0; j <= ms; j++) {
            System.out.printf("%3d", j);
        }
        System.out.println();
        for (int i = 0; i < fs + 1; i++) {
            System.out.printf("%3d", i);
            for (int j = 0; j < ms + 1; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    private void sort(Map<QualifiedName, Integer> nameIndexMap, Map<Integer, QualifiedName> indexNameMap,
                      Map<Field, Integer> fieldIndexMap, Map<Integer, Field> indexFieldMap,
                      int ms, int fs, int mc, int fc, int[][] matrix) {
        // rows
        for (int i = 0; i < fs; i++) {
            for (int j = 0; j < fs - i - 1; j++) {
                int vc = matrix[j][ms];
                int jn = j + 1;
                int vn = matrix[jn][ms];
                if (vc < vn) {
                    // swap row j and j+1
                    swapRow(matrix, j, jn, mc);
                    Field fj = indexFieldMap.remove(j);
                    Field fjn = indexFieldMap.remove(jn);
                    fieldIndexMap.put(fj, jn);
                    indexFieldMap.put(jn, fj);
                    fieldIndexMap.put(fjn, j);
                    indexFieldMap.put(j, fjn);
                }
            }
        }

        // columns
        for (int i = 0; i < ms; i++) {
            for (int j = 0; j < ms - i - 1; j++) {
                int vc = matrix[fs][j];
                int jn = j + 1;
                int vn = matrix[fs][jn];
                if (vc < vn) {
                    // swap column j and j+1
                    swapColumn(matrix, j, jn, fc);
                    QualifiedName qj = indexNameMap.remove(j);
                    QualifiedName qjn = indexNameMap.remove(jn);
                    nameIndexMap.put(qj, jn);
                    indexNameMap.put(jn, qj);
                    nameIndexMap.put(qjn, j);
                    indexNameMap.put(j, qjn);
                }
            }
        }
    }

    private boolean isSet(int[][] matrix, int f, int m) {
        return matrix[f][m] == 1;
    }

    private boolean maxRect(int[][] matrix, int f1, int m1, int f2, int m2) {
        int f = f1;
        for (; f <= f2; f++) {
            int m = m1;
            for (; m <= m2; m++) {
                if (!isSet(matrix, f, m)) {
                    break;
                }
            }
            if (m <= m2) {
                break;
            }
        }
        return f > f2;
    }

    public Point maxArea(int[][] matrix, int fs, int ms, int f, int m) {
        int maxArea = 0;
        int mf = 0;
        int mm = 0;
        for (int f1 = f; f1 < fs; f1++) {
            for (int m1 = m; m1 < ms; m1++) {
                if (maxRect(matrix, f, m, f1, m1)) {
                    int area = (f1 - f + 1) * (m1 - m + 1);
                    if (area > maxArea) {
                        maxArea = area;
                        mf = f1;
                        mm = m1;
                    }
                }
            }
        }
        return new Point(mf, mm);
    }

    public Optional<Rect> maxArea(int[][] matrix, int fs, int ms) {
        int maxArea = 0;
        Point lt = new Point();
        Point rb = new Point();
        for (int f = 0; f < fs; f++) {
            for (int m = 0; m < ms; m++) {
                Point p = maxArea(matrix, fs, ms, f, m);
                if (p.x > 0 && p.y > 0) {
                    int area = (p.x - f + 1) * (p.y - m + 1);
                    if (area > maxArea) {
                        maxArea = area;
                        lt.x = f;
                        lt.y = m;
                        rb.x = p.x;
                        rb.y = p.y;
                    }
                }
            }
        }
        System.out.printf("(%d,%d)-(%d,%d)=%d%n", lt.x, lt.y, rb.x, rb.y, maxArea);
        if (maxArea > 0) {
            return Optional.of(new Rect(lt, rb));
        }
        return Optional.empty();
    }

    private int[][] init(Map<QualifiedName, Message> messageMap,
                         Map<QualifiedName, Integer> nameIndexMap,
                         Map<Field, Integer> fieldIndexMap) {
        int[][] matrix = init(nameIndexMap.size(), fieldIndexMap.size());
        for (Map.Entry<QualifiedName, Message> entry : messageMap.entrySet()) {
            QualifiedName key = entry.getKey();
            int j = nameIndexMap.get(key);
            Message message = entry.getValue();
            List<Field> fields = message.getFields();
            for (Field field : fields) {
                int i = fieldIndexMap.get(field);
                matrix[i][j] = 1;
            }
        }
        return matrix;
    }

    private void swapRow(int[][] matrix, int r1, int r2, int length) {
        int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            temp[i] = matrix[r1][i];
            matrix[r1][i] = matrix[r2][i];
            matrix[r2][i] = temp[i];
        }
    }

    private void swapColumn(int[][] matrix, int c1, int c2, int length) {
        int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            temp[i] = matrix[i][c1];
            matrix[i][c1] = matrix[i][c2];
            matrix[i][c2] = temp[i];
        }
    }
}