package Study.Recursion;

public class Mathx {
    public static int fibonacci(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("fibonacci: num > 0");
        }

        else if (num == 0) {
            return 0;
        }

        else if (num == 1) {
            return 1;
        }
        // Math.addExact : int형의 최대값을 초과할 경우 Exception 발생
        return Math.addExact(fibonacci(num - 1), fibonacci(num - 2));
    }

    // factorial (n!) = n * (n-1)!
    public static int factorial(int num) {

        if (num == 0) {
            return 1;
        }

        else if (num < 0) {
            throw new IllegalArgumentException("factorial : num < 0");
        }

        // int MAX_VALUE보다 큰 값 -> ArithmeticException
        return Math.multiplyExact(num, factorial(num -1));


    }


}
