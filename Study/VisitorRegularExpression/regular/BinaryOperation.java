package Study.VisitorRegularExpression.regular;

public class BinaryOperation {

    private Expression left;
    private Expression right;

    protected BinaryOperation(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }
}
