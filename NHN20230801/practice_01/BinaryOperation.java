package practice_01;

// interface는 지켜야 할 조건을 기술

@FunctionalInterface
public interface BinaryOperation {
    public double apply(double x, double y);
}