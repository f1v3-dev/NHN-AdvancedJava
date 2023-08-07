package NHN20230807.regular;

public final class Or extends BinaryOperationBase implements Expression {


    public Or(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String getOperator() {
        return "|";
    }
}
