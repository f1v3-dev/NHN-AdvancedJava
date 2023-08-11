package Abstraction;

public class Mathx {

    public static long gcd(long x, long y) {
        if (x % y == 0) {
            return y;
        }
        return gcd(y, x % y);
    }

    public static int[] addFunction(int[] numbers) {
        int[] result = new int[2];
        result[0] = numbers[0] * numbers[3] + numbers[1] * numbers[2];
        result[1] = numbers[1] * numbers[3];
        return result;
    }


}


