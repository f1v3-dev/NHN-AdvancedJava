package study;

public class Mathx {


    /**
     * Plus Code
     */
    static double sum(int num) {
        return num * (num + 1) / 2;
    }

    // static double sum(double... numbers) {
    // double result = 0;
    // for (double number : numbers) {
    // result += number;
    // }
    // return result;
    // }

    static double sum(double... numbers) {
        return reduce(new Plus(), 0, numbers);
    }

    /**
     * Multiply Code
     */

    static double product(double x, double y) {
        return x * y;
    }

    // static double product(double... numbers) {
    // double result = 1;
    // for (double number : numbers) {
    // result *= number;
    // }
    // return result;
    // }

    static double product(double... numbers) {
        return reduce(new Multiply(), 1, numbers);
    }



    /**
     * Reduce Code
     */

    static double reduce(BinaryOperation binaryOperation, double init, double... numbers) {
        return reduceIf(x -> true, binaryOperation, init, numbers);
    }


    static double reduceIf(Predicate predicate, BinaryOperation binaryOperation, double init, double... numbers) {
        double result = init;

        for (double number : numbers) {
            if (predicate.apply(number)) {
                result = binaryOperation.apply(result, number);
            }
        }
        return result;
    }

    

}
