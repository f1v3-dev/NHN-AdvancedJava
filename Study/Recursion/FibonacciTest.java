package Study.Recursion;

import static Recursion.Mathx.fibonacci;

public class FibonacciTest {

    public static void preCondition() {
        try {
            fibonacci(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Pass Precondition");
            return;
        }
        System.exit(1);
    }

    public static void postCondition() {
        try {
            for (int i = 0; i < 100; i++) {
                fibonacci(i);
            }
        } catch (ArithmeticException e) {
            System.out.println("fibonacci : ArithmeticException");
            return;
        } catch (StackOverflowError e) {
            System.out.println("fibonacci : StackOverflowError");
            return;
        }
        System.exit(1);
    }

    public static void baseCase() {
        if (fibonacci(0) == 0 && fibonacci(1) == 1) {
            System.out.println("Pass Base Case");
            return;
        } else {
            System.exit(1);
        }


    }

    public static void recursionCase() {
        int[][] answers = {{5, 5}, {6, 8}, {7, 13}, {8, 21}, {9, 34}, {11, 89}};

        for (int[] answer : answers) {
            if (answer[1] != fibonacci(answer[0])) {
                System.exit(1);
            }
        }
        System.out.println("Pass Recursion Case");
    }


}
