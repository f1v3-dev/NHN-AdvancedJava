package Recursion;

public class MathxTest {

    // default constructor는 private으로 막는다.
    private MathxTest() {}

    public static void fibonacciTest() {
        FibonacciTest.baseCase();
        FibonacciTest.recursionCase();
        FibonacciTest.preCondition();
        FibonacciTest.postCondition();
    }

    public static void factorialTest() {
        FactorialTest.baseCase();
        FactorialTest.recursionCase();
        FactorialTest.preCondition();
        FactorialTest.postCondition();
    }

    public static void main(String[] args) {
//        fibonacciTest();
        factorialTest();


    }
}
