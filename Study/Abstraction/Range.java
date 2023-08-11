package Abstraction;

public class Range {

    // Abstraction Barrier
    private int lowerBound;
    private int upperBound;

    public Range(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        classInvariant();
        isPositive();
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    private void classInvariant() {
        if (this.getLowerBound() > this.getUpperBound()) {
            throw new IllegalArgumentException("Range : " + this.getLowerBound() + "(lowerBound) is bigger than " + this.getUpperBound() + "(upperBound)");
        }
    }

    private void isPositive() {
        if (this.getLowerBound() < 0 || this.getUpperBound() < 0) {
            throw new IllegalArgumentException("This is not Positive Number!!");
        }
    }
}
