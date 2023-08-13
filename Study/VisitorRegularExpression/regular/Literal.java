package Study.VisitorRegularExpression.regular;

public final class Literal implements Expression {

    private char character;

    public Literal(char character) {
        this.character = character;
    }

    public char getCharacter() {
        return character;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
