package NHN20230803.practice_03;

public class Mathx {

    public static int sum(int n) {
        return n * (n + 1) / 2;
    }

    public static int sum(Range range) {
        return sum(range.getUpperBound()) - sum(range.getLowerBound() - 1);
    }

    public static int gcd(int x, int y) {
        if (x % y == 0) {
            return y;
        }
        return gcd(y, x % y);
    }

    public static int[] addF(int[] numbers) {
        int[] result = new int[2];
        result[0] = numbers[0] * numbers[3] + numbers[1] * numbers[2];
        result[1] = numbers[1] * numbers[3];
        return result;
    }

}
