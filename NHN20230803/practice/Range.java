package practice;

public final class Range {

    private int lowerBound;
    private int upperBound;

    // Abstraction barrier
    public Range(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        classInvariant();
    }

    public Range(int upperBound) {
        this(0, upperBound);
    }

    // selector -> getter
    public int getLowerBound() { 
        return this.lowerBound;
    }

    public int getUpperBound() { 
        return this.upperBound;
    }

    private void classInvariant() {
        if (this.getLowerBound() > this.getUpperBound()) {
            throw new IllegalArgumentException("Range : " + this.lowerBound + " > " + this.upperBound);
        }
    }

    private void isPositive() {
        if (lowerBound < 0 || upperBound < 0) {
            throw new IllegalArgumentException("This is not Positive Number");
        }
    }

}
