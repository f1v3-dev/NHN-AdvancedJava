package NHN20230808.DynamicDispatch;

public class 뛰어 implements Visitor {
    @Override
    public void visit(Left left) {
        System.out.println("왼쪽으로 뛰어");

    }

    @Override
    public void visit(Right right) {
        System.out.println("오른쪽으로 뛰어");
    }
}
