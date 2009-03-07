// Autogenerated AST node
package org.python.pydev.parser.jython.ast;
import org.python.pydev.parser.jython.SimpleNode;

public final class suiteType extends SimpleNode {
    public stmtType[] body;

    public suiteType(stmtType[] body) {
        this.body = body;
    }

    public suiteType(stmtType[] body, SimpleNode parent) {
        this(body);
        this.beginLine = parent.beginLine;
        this.beginColumn = parent.beginColumn;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("suite[");
        sb.append("body=");
        sb.append(dumpThis(this.body));
        sb.append("]");
        return sb.toString();
    }

    public Object accept(VisitorIF visitor) throws Exception {
        traverse(visitor);
        return null;
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (body != null) {
            for (int i = 0; i < body.length; i++) {
                if (body[i] != null)
                    body[i].accept(visitor);
            }
        }
    }

}
