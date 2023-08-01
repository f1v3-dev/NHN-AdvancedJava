package study;

public class MathxTest {

    public static void main(String[] args) {

        // SUM TEST CODE
        System.out.println(Mathx.sum(10));
        System.out.println(Mathx.sum(1, 2, 3, 4, 5));

        BinaryOperation plus = (x, y) -> x + y;
        System.out.println(Mathx.reduce(plus, 0, 1, 2, 3, 4, 5));
        System.out.println(Mathx.reduce(new BinaryOperation() {
            public double apply(double x, double y){
                return x + y;
            }
        }, 0, 1, 2, 3, 4, 5));
    

        // MULTIPLY TEST CODE
        System.out.println(Mathx.product(30, 10));
        System.out.println(Mathx.product(4, 5, 6));
        System.out.println(Mathx.product(3, 4, 5, 6, 123));

        BinaryOperation multiply = (x, y) -> x * y;
        System.out.println(Mathx.reduce(multiply, 1, 1, 2, 3, 4));
        System.out.println(Mathx.reduce(new BinaryOperation() {
            public double apply(double x, double y) {
                return x * y;
            }
        }, 1, 1, 2, 3, 4));

        // 들어오는 값 (x)
        // 짝수이면 x * y / 홀수이면 x + y
        Predicate isEven = x -> x % 2 == 0;
        BinaryOperation mul = (x, y) -> x * y;
        System.out.println(Mathx.reduceIf(isEven, mul, 1, 1, 2, 3, 4, 5, 6));

        Predicate isOdd = x -> x % 2 == 1;
        BinaryOperation sum = (x, y) -> x + y;
        System.out.println(Mathx.reduceIf(isOdd, sum, 0, 1, 2, 3, 4, 5));

    }

}
