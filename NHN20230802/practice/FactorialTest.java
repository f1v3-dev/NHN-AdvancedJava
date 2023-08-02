package NHN20230802.practice;

import static NHN20230802.practice.Mathx.*;

public class FactorialTest {

    public static void baseCase() {
        assert factorial(0) == 1;
    }

    public static void recursionCase() {
        int[][] answers = {{1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}, {6, 720}, {7, 5040}, {8, 40320}};
        for (int[] answer : answers) {
            assert factorial(answer[0]) == answer[1];
        }
    }

    
    public static void preCondition() {
        try {
            factorial(-1);
        } catch(IllegalArgumentException e) {
            System.out.println("facotiral : IllegalArgumentException");
            return;
        }
        assert false;
    }

    public static void postCondition() {
        try {
            factorial(13);
        } catch(ArithmeticException e) {
            System.out.println("factorial : ArithmeticException");
            return;
        } catch(StackOverflowError e) {
            System.out.println("factorial : StackOverflowError");
            return;
        }
        assert false;
    }

}
