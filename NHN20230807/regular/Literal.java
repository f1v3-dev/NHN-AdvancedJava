package NHN20230807.regular;

public final class Literal implements Expression {

    private char character;

    public Literal(char c) {
        this.character = c;
    }

    public char getCharacter() {
        return character;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
