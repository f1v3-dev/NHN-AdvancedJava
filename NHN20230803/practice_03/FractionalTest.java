package NHN20230803.practice_03;

public class FractionalTest {

    private FractionalTest() {}

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

        Fractional[] rs = {
                new Fractional(1, 2),
                new Fractional(2, 4),
                new Fractional(4, 8),
                new Fractional(5, 10)
        };
        
        for (Fractional r : rs) {
            // System.out.println("r.intValue() = " + r.intValue());
        }

//        System.out.println(Mathx.reduce((x, y) -> x + y, "", "Hello", " world!"));
//        System.out.println(Mathx.reduceIf(x -> true, Fractional::add, rs[0], rs[1], rs[2], rs[3]));
//        System.out.println(Mathx.reduceIf(x -> true, (x, y) -> x + y, "", "a", "b"));

    }
}
