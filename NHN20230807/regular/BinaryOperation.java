package NHN20230807.regular;

class BinaryOperation {
    private Expression left;
    private Expression right;
    private String operator;

    protected BinaryOperation(Expression left, String operator, Expression right) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    public String getOperator(){
        return operator;
    }

    @Override
    public String toString() {
        return "(" + this.getLeft() + this.getOperator() + this.getRight() + ")";
    }

    public String literals() {
        return this.getLeft().literals() + this.getRight().literals();
    }
}