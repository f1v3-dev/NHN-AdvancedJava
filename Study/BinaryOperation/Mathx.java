package Study.BinaryOperation;

public class Mathx {


    /**
     * Plus Code
     */
    public static double sum(int num) {
        return num * (num + 1) / 2;
    }

    public static double sum(double... numbers) {
        return reduce(new Plus(), 0, numbers);
    }


    /**
     * Multiply Code
     */
    public static double product(double x, double y) {
        return x * y;
    }

    public static double product(double... numbers) {
        return reduce(new Multiply(), 1, numbers);
    }

    /**
     * Reduce Code
     */
    public static double reduce(BinaryOperation binaryOperation, double init, double... numbers) {
        double result = init;

        for (double number : numbers) {
            result = binaryOperation.apply(result, number);
        }
        return result;
    }

    public static double reduceIf(Predicate predicate, BinaryOperation binaryOperation, double init, double... numbers) {

        double result = init;

        for (double number : numbers) {
            if (predicate.apply(number)) {
                result = binaryOperation.apply(result, number);
            }
        }
        return result;
    }

}
