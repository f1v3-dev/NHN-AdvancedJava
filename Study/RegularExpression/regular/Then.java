package RegularExpression.regular;

public class Then extends BinaryOperation implements Expression {

    public Then(Expression left, Expression right) {
        super(left, "", right);
    }
}
