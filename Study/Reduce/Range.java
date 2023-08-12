package Study.Reduce;

public class Range {

    private int lowerBound;
    private int upperBound;

    public Range(int upperBound) {
        this.lowerBound = 0;
        this.upperBound = upperBound;

    }

    public Range(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }


    public int getLowerBound() {
        return lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public int min() {
        return this.getLowerBound();
    }

    public int max() {
        return this.getUpperBound();
    }

}
