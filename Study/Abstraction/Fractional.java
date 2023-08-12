package Study.Abstraction;

import java.util.Objects;

public class Fractional extends Number {

    private long numerator;
    private long denominator;

    public Fractional(long numerator, long denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("denominator is zero(0).");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        normalize();
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public void normalize() {
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

        if (!(obj instanceof Fractional)) {
            return false;
        }
        Fractional other = (Fractional) obj;
        return this.equals(other);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return "Fractional [numerator=" + numerator + ", denominator=" + denominator + "]";
    }

    @Override
    public int intValue() {
        return (int) this.longValue();
    }

    @Override
    public long longValue() {
        return (this.getNumerator() / this.getDenominator());
    }

    @Override
    public float floatValue() {
        return (float) this.doubleValue();
    }

    @Override
    public double doubleValue() {
        return ((double) this.getNumerator() / (double) this.getDenominator());
    }
}
