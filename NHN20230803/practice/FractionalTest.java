package practice;

public class FractionalTest {

    /**
     * 유리수의 덧셈 공식 유리수 4개 새로운 클래스 X 네 개의 숫자를 받을 때 까지 반복해서 받기 정수 네개만 들어온다면 통과 에러 처리 생략 -> 무조건 네 개가
     * 들어온다고 약속 main에 전부 생성a
     */

    private FractionalTest() {}

    public static int[] fractional(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("demoniator is zero(0)");
        }
        return new int[] {numerator, denominator};
    }

    public static int numerator(int[] arr) {
        return arr[0];
    }

    public static int denominator(int[] arr) {
        return arr[1];
    }

    public static int[] add(int[] arr1, int[] arr2) {
        int[] result = new int[2];
        result[0] = numerator(arr1) * denominator(arr2) + denominator(arr1) * numerator(arr2);
        result[1] = denominator(arr1) * denominator(arr2);

        int div = Mathx.gcd(result[0], result[1]);
        result[0] /= div;
        result[1] /= div;
        return result;
    }

    private static String toString(int[] arr) {
        return numerator(arr) + "/" + denominator(arr);
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


        int[] x = fractional(1, 2);
        int[] y = fractional(2, 4);
        int[] z = fractional(4, 8);
        int[] w = fractional(8, 16);
        int[] val = FractionalTest.add(add(x, add(x, y)), add(w, z));
        System.out.println(val[0] + "/" + val[1]);

        System.out.println(toString(add(fractional(1, 2), fractional(4, 8))));
    }

}

// function recursion? GCD -> int int -> int
