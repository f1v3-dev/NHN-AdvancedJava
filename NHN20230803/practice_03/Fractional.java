package NHN20230803.practice_03;

public class Fractional {
    private int numerator;
    private int denominator;
//    private int[] rep;

    public Fractional(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("denominator is zero(0)");
        }
//        this.rep = new int[]{numerator, denominator};
        this.numerator = numerator;
        this.denominator = denominator;
        normalize();
        // classInvariant(); <- 유리수 검증 조건
    }

    // Getter, selector
    public int numerator() {
        return this.numerator;
    }

    public int denominator() {
        return this.denominator;
    }

    private void normalize() {
        int gcdValue = Mathx.gcd(this.numerator, this.denominator);
        this.numerator /= gcdValue;
        this.denominator /= gcdValue;
    }

    public Fractional add(Fractional arr) {
        return new Fractional(
                this.numerator() * arr.denominator() + this.denominator() * arr.numerator(),
                this.denominator() * arr.denominator());
    }

    @Override
    public String toString() {
        return this.numerator() + "/" + this.denominator();
    }

    public boolean equals(Fractional that) {
        return (this.numerator() == that.numerator()
                && this.denominator() == that.denominator());
    }

}
