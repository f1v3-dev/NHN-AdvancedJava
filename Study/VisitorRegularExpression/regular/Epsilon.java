package Study.VisitorRegularExpression.regular;

public final class Epsilon implements Expression {

    public static final Epsilon value = new Epsilon();

    private Epsilon() {}

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
