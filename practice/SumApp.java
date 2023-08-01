package practice;

// 변수명 : Sum
// 값 : { ... }
// 타입 : class
// Life time : 프로그램 실행 - 종료
public class SumApp { // name space

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

        System.out.println("args의 길이 : " + args.length);

        /**
         * Step1. [terminal -> command] javac practice\PrintArgs java practice.PrintArgs 1 2 3
         * output : 1 2 3
         */

        // for (String arg : args) {
        // System.out.print(arg + " ");
        // }
        // ---------------------------------------------------------


        /**
         * Step2. args 배열에 저장되는 값 출력 String[] : 여러개의 문자열을 저장한다. 인자의 수를 맞춰주지 않을 경우
         * java.lang.ArrayIndexOutOfBoundsException 발생
         * 
         * [Run] java practice.PrintArgs 소 말 돼지
         * 
         * [output] args의 길이 : 3 소 말 돼지
         */

        // // for문으로 구현
        // for (int index = 0; index < args.length; index++) {
        // System.out.println(args[index]);
        // }

        // // while문으로 구현
        // int index = 0;
        // while (index < args.length) {
        // System.out.println(args[index++]);
        // }
        // ---------------------------------------------------------

        /**
         * Step3. args로 넘어온 값을 모두 더해 출력
         */

        // double result = 0;
        // int index = 0;
        // while (index < args.length) {
        // result += Double.valueOf(args[index]); // concatenation
        // index += 1;
        // }
        // System.out.println(result);

        // ---------------------------------------------------------

        /**
         * Step4. sum 함수 사용하기
         */

        // int index = 0;
        // double result = 0;
        // while (index < args.length) {
        // // result += Double.valueOf(args[index]);
        // result = sum(result, Double.valueOf(args[index]));
        // index += 1;
        // }
        // System.out.println(result);

        // ---------------------------------------------------------


        /**
         * Step5. sum 사용
         */

        // Heap - reference count, garbage collection
        // 참조 횟수를 계산한 후 0이 되면 가비지 컬렉션이 메모리 해제
        double[] numbers = new double[args.length];

        for (int index = 0; index < args.length; index++) {
            numbers[index] = Double.valueOf(args[index]);
        }

        System.out.println(sum(numbers));
        System.out.println(sum(2, 3));
        System.out.println(sum(2, 3.5, 4, 10));

        // 둘의 값이 같다고 하는 이유 : Type Promotion
        System.out.println(sum(10) == sum(1, 3, 2, 6, 5, 4, 8, 9, 7, 10)); // 55.0
    
        // System.out.println(Mathx.reduce(new BinaryOperation() {
        //     public double apply(double x, double y) {
        //         return x + y;
        //     }
        // }, 0, 1, 2, 3, 4));

        // BinaryOperation plus = new BinaryOperation() {
        //     public double apply(double x, double y) {
        //         return x + y;
        //     }
        // };
        // System.out.println(Mathx.reduce((x, y) -> x + y, 0, 1, 2, 3, 4));

        // 다음과 같이 람다식으로 사용할 떄는 Functional implements여야 함
        // 즉, 한가지의 추상 메서드만 존재
        BinaryOperation plus = (x, y) -> x + y;
        System.out.println(Mathx.reduce(plus, 0, 1, 2, 3, 4));

    }
}
