package NHN20230802.practice;

public class Mathx {

    private Mathx() {}

    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("fibonacci: n < 0");
        }

        else if (n == 0) {
            return 0;
        }
        
        else if (n == 1) {
            return 1;
        }
        return Math.addExact(fibonacci(n - 1), fibonacci(n - 2));
    }

    public static int fibonacciV2(int n) {
        int result = 0;
        int x = 0;
        int y = 1;
        
        while(n-- > 1) {
            result = x+y;
            x = y;
            y = result;
        }
        return result;
    }


    // n! = n * (n-1)!
    public static int factorial(int n) {

        // preCondition
        if (n < 0) {
            throw new IllegalArgumentException("factorial n < 0");
        }

        // base case
        if (n == 0) {
            System.out.println("factorial(0) = 1");
            return 1;
        }

        // recursion case & postCondition
        System.out.println(n + " * factorial(" + (n - 1) + ")");
        int result = Math.multiplyExact(n, factorial(n - 1));
        System.out.println(n + " * factorial(" + (n - 1) + ")");
        return result;

        // base case & recursion case & postCondition
        
        // return n == 0 ? 1 : Math.multiplyExact(n, factorial(n - 1));
    }
    
}
