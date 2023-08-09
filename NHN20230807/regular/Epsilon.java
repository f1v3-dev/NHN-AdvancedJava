package NHN20230807.regular;

public class Epsilon implements Expression {
    public static final Epsilon value = new Epsilon();

    private Epsilon() {
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
