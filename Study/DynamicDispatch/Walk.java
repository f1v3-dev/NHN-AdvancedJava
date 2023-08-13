package Study.DynamicDispatch;

public class Walk implements Visitor {
    @Override
    public void visit(Left left) {
        System.out.println("왼쪽으로 걸어!");
    }

    @Override
    public void visit(Right right) {
        System.out.println("오른쪽으로 걸어!");
    }
}
