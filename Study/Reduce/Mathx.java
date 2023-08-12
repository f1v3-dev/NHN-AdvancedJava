package Study.Reduce;

import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;

public class Mathx {

    public static <E, R> R reduce(Predicate<E> predicate, BiFunction<R, E, R> binaryFunction,
                                  R init, Iterator<E> iterator) {
        R result = init;

        try {
            while (iterator.hasNext()) {
                E element = iterator.next();
                if (predicate.test(element)) {
                    result = binaryFunction.apply(result, element);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.exit(1);
        }
        return result;
    }

    public static <E, R> R reduce(BiFunction<R, E, R> binaryFunction, R init, Iterator<E> iterator) {
        return reduce(x -> true, binaryFunction, init, iterator);
    }

    public static double reduce(DoubleBinaryOperator binaryOperator, double init, double... numbers) {
        Iterator<Double> iterator = new Iterator<>() {
            // ...
            private int index = 0;
            double[] values = numbers;
            @Override
            public boolean hasNext() {
                // ...
                return index < numbers.length;
            }

            @Override
            public Double next() {
                return numbers[index++];
            }
        };

        return reduce((x, y) -> binaryOperator.applyAsDouble(x.doubleValue(), y.doubleValue()),
                Double.valueOf(init), iterator);
    }

//    public static double reduce(DoubleBinaryOperator binaryOperator, double init, double... numbers) {
//        return reduce((x, y) -> binaryOperator.applyAsDouble(x.doubleValue(), y.doubleValue()),
//                Double.valueOf(init), DoubleStream.of(numbers).iterator());
//    }


    public static double product(double... numbers) {
        return reduce(((x, y) -> x * y), 1, numbers);

    }

    public static double sum(double... numbers) {
        return reduce(((x, y) -> x + y), 0, numbers);
    }

    public static long sum(Range range) {
        final var max = range.max();
        final var min = range.min();
        return (max - min + 1) * (max + min) / 2;
    }
}
