package NHN20230801.practice_01;

public class Mathx {

    static double product(double x, double y) {
        return x * y;
    }

    /**
     * Sum.java와 Product.java의 코드는 매우 유사하다. 이 두개의 코드를 하나의 코드로 변경해보자
     */

    private static double product(double... numbers) {
        return reduce(new Multiply(), 1, numbers);
    }

    // fold-right, fold-left, accumulate
    public static double reduce(BinaryOperation binaryOperation, double init, double... numbers) {
        double result = init;
        for (double num : numbers) {
            // [LSP] Liskov Substitution Principle -> 자식 클래스는 부모 클래스에서 가능한 행위를 수행
            result = binaryOperation.apply(result, num);
        }
        return result;
    }

    public static double reduceIf(Predicate predicate, BinaryOperation binaryOperation, double init, double... numbers) {
        double result = init;
        for (double num : numbers) {
            if (predicate.apply(num)) {
                result = binaryOperation.apply(result, num);
            }
        }
        return result;
    }
    
    // sum :: (double, double) -> double
    // static double sum(double x, double y) {
    // return x + y;
    // }

    // sum :: double[] arrays -> double
    // [Polymorphism (다형성)]
    // Overloading 사용하여 인자 개수에 따라 다르게 적용
    // 함수의 Type signature -> [static int sum(int num);]
    static int sum(int num) {
        return ((num + 1) * num) / 2;
    }

    // numbers, result 둘 다 Local
    // But, numbers는 매개변수이므로 값을 지정하지 않아도 된다.
    // numbers : Dynamic
    // result : Static
    // static double sum(double... numbers) {
    // double result = 0;
    // numbers[1] = 0;
    // for (int index = 0; index < numbers.length; index++) {
    // result += numbers[index];
    // }
    // return result;
    // }

    // 범위 연산 -> Overloading은 사용하면 안된다.
    // 5, 10을 넘기면 답 = 15? / 5 ~ 10사이를 더한 값?
    // 어떻게 해결해야 하는가?

    /**
     * Java : Call by value (변수에 할당된 값을 복사해서 전달) Call by reference는 변수의 주소 값 자체를 전달 -> C++에서만 new로
     * 생성한 객체는 값이 주소이기 때문에 Heap에 저장
     */


    /**
     * 변수 = (이름, 값, 범위(scope), 타입(저장 공간의 크기, 값의 해석), Life Time) '이름'이 (...)을 간추림 -> Abstraction
     * [추상화] 즉, Abstraction은 이름을 붙이는 것 바인딩(binding)이란? : 프로그램에서 사용되는 변수, 메서드 등 모든 것들이 결정되도록 연결해주는 것
     * 바인딩이 되는 시점에 따라 [Static Binding], [Dynamic Binding]
     **/

    private static double sum(double... numbers) {
        // return reduce(new Sum(), 0, numbers);
        return Mathx.reduce(new Plus(), 0, numbers);
    }



    public static void main(String[] args) {

        double[] numbers = new double[args.length];

        int index = 0;
        for (String numString : args) {
            numbers[index++] = Double.valueOf(numString);
        }

        System.out.println(product(30, 10));
        System.out.println(product(numbers));
        System.out.println(product(4, 5, 6));
        System.out.println(product(3, 4, 5, 6, 123));

        // BinaryOperation multiply = new BinaryOperation() {
        // public double apply(double x, double y) {
        // return x * y;
        // }
        // };
        // System.out.println(reduce(multiply, 1, 1, 2, 3, 4));

        // System.out.println(reduce(new BinaryOperation() {
        // public double apply(double x, double y) {
        // return x * y;
        // }
        // }, 1, 1, 2, 3 ,4));

        BinaryOperation multiply = (x, y) -> x * y;
        System.out.println(reduce(multiply, 1, 1, 2, 3, 4));


    }
}
