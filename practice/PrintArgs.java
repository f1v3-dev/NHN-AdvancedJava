package practice;

public class PrintArgs { // name space

    // sum :: (double, double) -> double
    static double sum(double x, double y) {
        return x + y;
    }

    // sum :: double[] arrays -> double
    // [Polymorphism (다형성)]
    // Overloading 사용하여 인자 개수에 따라 다르게 적용
    // 함수의 Type signature -> [static int sum2(int num);]
    static int sum2(int num) {
        return ((num + 1) * num) / 2;
    }

    static double sum2(double... numbers) {
        double result = 0;
        for (int index = 0; index < numbers.length; index++) {
            result += numbers[index];
        }
        return result;
    }

    // 범위 연산 -> Overloading은 사용하면 안된다.
    // 5, 10을 넘기면 답 = 15? / 5 ~ 10사이를 더한 값?
    // 어떻게 해결해야 하는가?
    // static double sum2(int min, int max) {
    //
    // }

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
         * Step5. sum2 사용
         */

        double[] numbers = new double[args.length];

        for (int index = 0; index < args.length; index++) {
            numbers[index] = Double.valueOf(args[index]);
        }

        System.out.println(sum2(numbers));
        System.out.println(sum2(2, 3));
        System.out.println(sum2(2, 3.5, 4, 10));

        // 둘의 값이 같다고 하는 이유 : Type Promotion
        System.out.println(sum2(10)
                 == sum2(1, 3, 2, 6, 5, 4, 8, 9, 7, 10)); // 55.0
                
        // System.out.println(sum2(10));
        // System.out.println(sum2(1, 3, 2, 6, 5, 4, 8, 9, 7, 10));
    }
}
