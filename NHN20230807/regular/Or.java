package NHN20230807.regular;

public final class Or extends BinaryOperation implements Expression {

    public Or(Expression left, Expression right) {
        super(left, "|", right);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
