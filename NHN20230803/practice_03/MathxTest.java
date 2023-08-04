package practice_03;


public class MathxTest {

    private static void testRange() {
        RangeTest.classInvariant();
    }

    public static void main(String[] args) {
        MathxTest.testRange();
        System.out.println(Mathx.sum(new Range(10)));
        System.out.println(Mathx.sum(new Range(0, 10)));
        System.out.println(Mathx.sum(new Range(5, 10)));
        System.out.println(Mathx.sum(new Range(10)) == Mathx.sum(new Range(0, 10)));
    }
}
