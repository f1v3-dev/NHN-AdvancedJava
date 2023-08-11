package Recursion;

import static Recursion.Mathx.*;

public class FactorialTest {

    public static void preCondition() {
        try {
            fibonacci(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("factorial : " + e.getMessage());
            return;
        }
        System.exit(1);
    }

    public static void postCondition() {
        try {
            factorial(100);
        } catch (ArithmeticException e) {
            System.out.println("factorial : " + e.getMessage());
            return;
        } catch (StackOverflowError e) {
            System.out.println("factorial : " + e.getMessage());
            return;
        }
        System.exit(1);
    }

    public static void baseCase() {
        if (factorial(0) == 1) {
            System.out.println("Pass Base Case");
            return;
        }
        else {
            System.exit(1);
        }
    }

    public static void recursionCase() {
        int [][] answers = {{1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}};

        for (int[] answer : answers) {
            if (answer[1] == factorial(answer[0])) {
                System.out.println("Pass Recursion Case");
                return;
            } else {
                System.exit(1);
            }
        }
    }
}
