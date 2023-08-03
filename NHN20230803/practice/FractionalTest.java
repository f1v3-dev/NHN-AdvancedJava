package practice;

import java.util.Arrays;

public class FractionalTest {

    private FractionalTest() {}

    public static int[] fractional(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("denominator is zero(0)");
        }

        int[] rep = new int[] {numerator, denominator};
        // normalize(rep);
        // classInvariant(rep); <- ?
        return rep;
    }

    // Getter
    public static int numerator(int[] arr) {
        normalize(arr);
        return arr[0];
    }

    public static int denominator(int[] arr) {
        normalize(arr);
        return arr[1];
    }

    public static int[] add(int[] firstArr, int[] secondArr) {
        int x = numerator(firstArr) * denominator(secondArr)
                + denominator(firstArr) * numerator(secondArr);
        int y = denominator(firstArr) * denominator(secondArr);

        return fractional(x, y);
    }

    public static String toString(int[] arr) {
        return numerator(arr) + "/" + denominator(arr);
    }

    public static boolean equals(int[] firstArr, int[] secondArr) {
        return (numerator(firstArr) == numerator(secondArr)
                && denominator(firstArr) == denominator(secondArr));
    }

    private static void normalize(int[] arr) {
        int gcdValue = Mathx.gcd(arr[0], arr[1]);
        arr[0] /= gcdValue;
        arr[1] /= gcdValue;
    }


    public static void main(String[] args) {

        // int[] numbers = new int[4];
        // for (int i = 0; i < args.length; i++) {
        // numbers[i] = Integer.valueOf(args[i]);
        // }
        // try {
        // if (numbers[1] == 0 || numbers[3] == 0) {
        // throw new IllegalArgumentException("분모 is 0");
        // }
        // }

        // catch (IllegalArgumentException e) {
        // System.out.println(e.getMessage());
        // }

        // // int x = numbers[0] * numbers[3] + numbers[1] * numbers[2];
        // // int y = numbers[1] * numbers[3];
        // int [] result = Mathx.addF(numbers);

        // // System.out.println(x + "/" + y);

        // // System.out.println(Mathx.gcd(6, 4));
        // int div = Mathx.gcd(result[0], result[1]);
        // System.out.println(result[0] / div + "/" + result[1] / div);

        /**
         * int[] x = fractional(1, 2); int[] y = fractional(2, 4); int[] z = fractional(4, 8); int[]
         * w = fractional(5, 10); int[] val = FractionalTest.add(add(x, add(x, y)), add(w, z));
         * System.out.println(val[0] + "/" + val[1]);
         * 
         * System.out.println(toString(add(fractional(1, 2), fractional(4, 8))));
         * 
         * System.out.println(equals(x, y)); System.out.println(equals(add(x, y), add(z, w)));
         * 
         */

        int[][] rs = {fractional(1, 2), fractional(2, 4),
             fractional(4, 8), fractional(5, 10)};

        for (int[] arr : rs) {
            System.out.println(toString(arr));
        }
    }

}
