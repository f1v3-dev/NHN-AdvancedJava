package NHN20230807.usecases;

import NHN20230807.regular.*;

public final class Literals implements Visitor {
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

    private String getLiteralStringBuilder() {
        return this.literalStringBuilder.toString();
    }
}
