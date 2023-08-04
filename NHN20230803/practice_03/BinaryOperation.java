package NHN20230803.practice_03;

@FunctionalInterface
public interface BinaryOperation<T> {
    public T apply(T x, T y);
}

//class Stack<T extends Number> {
//    public stack() {}
//    public Stack push(T newElement) {}
//    public Stack pop() {}
//    public T top() {}
//}
//
//    public static void main(String[] args) {
//        Stack<String> stack = new Stack<>();
//        stack.push(new String("hello"));
//        // stack.push(new Character("a"));
//    }
//}