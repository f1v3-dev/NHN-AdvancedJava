package NHN20230803.practice_03;

/**
 * [How to design a data type?] 1. primitive operations to define a data type => ADT(abstract data
 * type), where primitives = abstraction barrier 2. combinations (combinational operations) / add,
 * multiply ...
 */
public class Fractional extends Number {
    
    private long numerator;
    private long denominator;

    public Fractional(long numerator, long denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("denominator is zero(0)");
        }

        this.numerator = numerator;
        this.denominator = denominator;
        normalize();
        // classInvariant(); <- 유리수 검증 조건
    }

    // Getter, selector
    public long getNumerator() {
        return this.numerator;
    }

    public long getDenominator() {
        return this.denominator;
    }

    private void normalize() {
        long gcdValue = Mathx.gcd(this.numerator, this.denominator);
        this.numerator /= gcdValue;
        this.denominator /= gcdValue;
    }

    public Fractional add(Fractional arr) {
        return new Fractional(
                this.getNumerator() * arr.getDenominator() + this.getDenominator() * arr.getNumerator(),
                this.getDenominator() * arr.getDenominator());
    }

    public boolean equals(Fractional that) {
        if (this == that)
            return true;
        if (that == null)
            return false;
        return (this.getNumerator() == that.getNumerator() && this.getDenominator() == that.getDenominator());
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Fractional))
            return false;
        Fractional other = (Fractional) obj;
        return this.equals(other);
    }

    @Override
    public String toString() {
        return "Fractional [numerator=" + numerator + ", denominator=" + denominator + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        long result = 1;
        result = prime * result + this.getNumerator();
        result = prime * result + this.getDenominator();
        return (int) result;
    }

    @Override
    public int intValue() {
        return (int) this.longValue();
    }

    @Override
    public long longValue() {
        return (long) (this.getNumerator() / this.getDenominator());
    }

    @Override
    public double doubleValue() {
        return ((double) this.getNumerator() / (double) this.getDenominator());
    }

    @Override
    public float floatValue() {
        return (float) this.doubleValue();
    }
}
