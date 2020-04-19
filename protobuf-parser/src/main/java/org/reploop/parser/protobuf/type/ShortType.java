package org.reploop.parser.protobuf.type;

import org.reploop.parser.protobuf.AstVisitor;

/**
 * Say something?
 *
 * @author George Cao(caozhangzhi@iqiyi.com)
 * @since 5/9/13 4:19 PM
 */
public class ShortType extends FieldType implements IntegerType {
    public ShortType() {
        super("short");
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitShortType(this, context);
    }

    @Override
    public int bits() {
        return 16;
    }
}
