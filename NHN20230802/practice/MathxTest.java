package NHN20230802.practice;

public class MathxTest {

    // default constructor
    private MathxTest() {}

    public static void fibonacciTest() {
        FibonacciTest.baseCase();
        FibonacciTest.recursionCase();
        FibonacciTest.preCondition();   // require
        FibonacciTest.postCondition();  // satisfy
    }

    public static void factorialTest() {
        FactorialTest.baseCase();
        FactorialTest.recursionCase();
        FactorialTest.preCondition();
        FactorialTest.postCondition();
    }

    public static void main(String[] args) {
        // MathxTest.fibonacciTest();
        // MathxTest.factorialTest();
        // System.out.println("factorial(3)");
        // System.out.println(Mathx.factorial(3));
        System.out.println(Mathx.fibonacciV2(8));
    }


}
