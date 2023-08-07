package NHN20230807.regular;

abstract class BinaryOperationBase {
    private Expression left;
    private Expression right;
//    private String operator;

//    protected BinaryOperation(Expression left, String operator, Expression right) {
//        this.left = left;
//        this.operator = operator;
//        this.right = right;
//    }


    protected BinaryOperationBase(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    public abstract String getOperator();

    @Override
    public String toString() {
        return "(" + this.getLeft() + this.getOperator() + this.getRight() + ")";
    }

}