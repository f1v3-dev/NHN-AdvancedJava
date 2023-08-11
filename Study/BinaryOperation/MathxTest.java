package BinaryOperation;

public class MathxTest {

    public static void main(String[] args) {

        // Sum Test Code
        System.out.println("[Sum Test Code]");
        System.out.println(Mathx.sum(10));
        System.out.println(Mathx.sum(1, 2, 3, 4, 5));

        BinaryOperation plus = (x, y) -> x + y;
        System.out.println(Mathx.reduce(plus, 0, 1, 2, 3, 4, 5));
        System.out.println(Mathx.reduce(new BinaryOperation() {
            @Override
            public double apply(double x, double y) {
                return x + y;
            }
        }, 0, 1, 2, 3, 4, 5));

        //-----------------------------------------
        System.out.println("-----------------------------------------");


        // Multiply Test Code
        System.out.println("[Multiply Test Code]");
        System.out.println(Mathx.product(30, 10));
        System.out.println(Mathx.product(4, 5, 6));
        System.out.println(Mathx.product(3, 4, 5, 6, 123));

        BinaryOperation multiply = (x, y) -> x * y;
        System.out.println(Mathx.reduce(multiply, 1, 30, 10));
        System.out.println(Mathx.reduce(new BinaryOperation() {
            @Override
            public double apply(double x, double y) {
                return x * y;
            }
        }, 1, 30, 10));


        /**
         * 들어오는 값 (x)가 짝수 : 곱셈, 홀수 : 덧셈
         */

        System.out.println("-----------------------------------------");
        System.out.println("[Predicate Test Code]");

        Predicate isEven = x -> x % 2 == 0;
        BinaryOperation mul = (x, y) -> x * y;
        System.out.println(Mathx.reduceIf(isEven, mul, 1, 1, 2, 3, 4));

        Predicate isOdd = x -> x % 2 == 1;
        BinaryOperation pls = (x, y) -> x + y;
        System.out.println(Mathx.reduceIf(isOdd, pls, 0, 1, 2, 3, 4));


    }
}
