package Study.DynamicDispatch;

public class VisitorPattern {

    public static void main(String[] args) {
        Top leftTop = new Left();
        Top rightTop = new Right();
        leftTop.accept(new Walk());
        rightTop.accept(new Run());
    }
}
