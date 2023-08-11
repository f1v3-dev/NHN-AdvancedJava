package RegularExpression.regular;

public interface Expression {

    public static final Epsilon EPSILON = Epsilon.value;

    default Expression or(Expression e) {
        return new Or(this, e);
    }

    default Expression then(Expression e) {
        return new Then(this, e);
    }

    default Expression start() {
        return new Star(this);
    }
}
