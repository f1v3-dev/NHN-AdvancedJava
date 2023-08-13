package Study.DynamicDispatch;

public class Right implements Top {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
