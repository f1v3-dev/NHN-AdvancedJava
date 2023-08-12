package Study.Abstraction;

public class RangeTest {

    public static void classInvariant() {

        int lowerBound = -2;
        int upperBound = -6;

        Range range = null;

        try {
            range = new Range(lowerBound, upperBound);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void lowerBound() {
        assert true;
    }

    public void upperBound() {
        assert true;
    }
}
