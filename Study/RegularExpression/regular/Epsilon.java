package RegularExpression.regular;

public class Epsilon implements Expression {

    public static final Epsilon value = new Epsilon();

    private Epsilon() {}

    @Override
    public String toString() {
        return "\u03B5";
    }
}
