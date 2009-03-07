// Autogenerated AST node
package org.python.pydev.parser.jython.ast;
import org.python.pydev.parser.jython.SimpleNode;

public final class Attribute extends exprType implements expr_contextType {
    public exprType value;
    public NameTokType attr;
    public int ctx;

    public Attribute(exprType value, NameTokType attr, int ctx) {
        this.value = value;
        this.attr = attr;
        this.ctx = ctx;
    }

    public Attribute(exprType value, NameTokType attr, int ctx, SimpleNode
    parent) {
        this(value, attr, ctx);
        this.beginLine = parent.beginLine;
        this.beginColumn = parent.beginColumn;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("Attribute[");
        sb.append("value=");
        sb.append(dumpThis(this.value));
        sb.append(", ");
        sb.append("attr=");
        sb.append(dumpThis(this.attr));
        sb.append(", ");
        sb.append("ctx=");
        sb.append(dumpThis(this.ctx,
        expr_contextType.expr_contextTypeNames));
        sb.append("]");
        return sb.toString();
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitAttribute(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (value != null)
            value.accept(visitor);
        if (attr != null)
            attr.accept(visitor);
    }

}
