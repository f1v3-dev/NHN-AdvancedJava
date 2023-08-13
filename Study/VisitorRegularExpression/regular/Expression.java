package Study.VisitorRegularExpression.regular;

public interface Expression {

    Epsilon EPSILON = Epsilon.value;

    default Expression or(Expression e){
        return new Or(this, e);
    }

    default Expression then(Expression e) {
        return new Then(this, e);
    }

    default Expression star() {
        return new Star(this);
    }

    public void accept(Visitor visitor);

}
