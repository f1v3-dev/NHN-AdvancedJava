package NHN20230807.regular;

public final class Star implements Expression {

    private Expression expression;

    public Star(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
