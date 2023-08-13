package Study.DynamicDispatch;

public interface Visitor {

    public void visit(Left left);

    public void visit(Right right);
}
