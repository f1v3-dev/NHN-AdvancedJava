package NHN20230807.regular;

public final class Then extends BinaryOperation implements Expression {

    public Then(Expression left, Expression right) {
        super(left, "", right);
    }
}