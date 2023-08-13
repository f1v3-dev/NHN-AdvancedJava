package Study.VisitorRegularExpression.usecases;

import Study.VisitorRegularExpression.regular.*;

public class Literals implements Visitor {

    private StringBuilder literalStringBuilder = new StringBuilder();
    @Override
    public void visit(Epsilon e) {
    }

    @Override
    public void visit(Literal e) {
        literalStringBuilder.append(e.getCharacter());
    }

    @Override
    public void visit(Then e) {
        e.getLeft().accept(this);
        e.getRight().accept(this);
    }

    @Override
    public void visit(Or e) {
        e.getLeft().accept(this);
        e.getRight().accept(this);
    }

    @Override
    public void visit(Star e) {
        e.getExpression().accept(this);
    }

    public static String of(Expression e) {
        Literals literals = new Literals();
        e.accept(literals);
        return literals.getLiteralStringBuilder();
    }

    public String getLiteralStringBuilder() {
        return literalStringBuilder.toString();
    }
}
