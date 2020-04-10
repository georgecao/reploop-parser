package org.reploop.parser.protobuf.tree;

import org.reploop.parser.protobuf.AstVisitor;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * What's this about?
 *
 * @author George Cao(caozhangzhi at qiyi.com)
 * @since 2015-06-08 17
 */
public class OptionPair extends Pair {
    String name;
    String attr;


    public OptionPair(String name, Value value) {
        super(name, value);
        this.name = name;
        this.attr = StringUtils.EMPTY;
    }

    public OptionPair(String name, String attr, Value value) {
        super(name + "." + attr, value);
        this.name = name;
        this.attr = attr;
    }

    public String getName() {
        return name;
    }

    public String getAttr() {
        return attr;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitOptionPair(this, context);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("attr", attr)
                .append("name", name)
                .append("value", value)
                .toString();
    }
}
