package Study.DynamicDispatch;

public class Left implements Top {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
