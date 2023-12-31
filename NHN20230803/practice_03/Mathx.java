package NHN20230803.practice_03;

import java.lang.reflect.Parameter;
import java.util.Iterator;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class Mathx {

    public static long gcd(long x, long y) {
        if (x % y == 0) {
            return y;
        }
        return gcd(y, x % y);
    }

    public static int[] addF(int[] numbers) {
        int[] result = new int[2];
        result[0] = numbers[0] * numbers[3] + numbers[1] * numbers[2];
        result[1] = numbers[1] * numbers[3];
        return result;
    }

//    public static double reduce(BinaryOperation binaryOperation, double init, double... numbers) {
//        return reduceIf(x -> true, binaryOperation, init, numbers);
//    }
//
//    public static double reduceIf(Predicate predicate, BinaryOperation binaryOperation, double init, double... numbers) {
//        double result = init;
//
//        for (double number : numbers) {
//            if (predicate.test(number)) {
//                result = binaryOperation.apply(result, number);
//            }
//        }
//        return result;
//    }

//    public static <T> T reduce(BinaryOperator<T> binaryOperation, T init, Iterator<T> iterator) {
//        if (iterator.hasNext()) {
//
//        }
//        return reduceIf(x -> true, binaryOperation, init, numbers);
//    }
//
//    public static <T> T reduceIf(Predicate<T> predicate, BinaryOperator<T> binaryOperation, T init, T... numbers) {
//        T result = init;
//
//        /*
//        // 배열만 들어올 수 있는 코드가 되어버린다.
//        for (int index = 0; index <= numbers.length; index++) {
//            if (predicate.test(numbers[index])) {
//                result = binaryOperation.apply(result, numbers[index]);
//            }
//        }
//        */

//        for (T number : numbers) {
//            if (predicate.test(number)) {
//                result = binaryOperation.apply(result, number);
//            }
//        }
//        return result;
//    }

}
