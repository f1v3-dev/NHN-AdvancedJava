package NHN20230807.regular;

public interface Visitor {

    public void visit(Epsilon e);

    public void visit(Literal e);

    public void visit(Then e);

    public void visit(Or e);

    public void visit(Star e);
}
