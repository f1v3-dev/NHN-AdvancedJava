package RegularExpression.regular;

public class Or extends BinaryOperation implements Expression {

    public Or(Expression left, Expression right) {
        super(left, "|", right);
    }
}
