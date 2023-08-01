package practice;

public class MathxTest {
    
    public static void main(String[] args) {
        
        // 들어오는 값 (x)가 짝수이면 x * y 
        System.out.println(Mathx.reduceIf(x -> x % 2 == 0, (x, y) -> x * y, 1, 1, 2, 3, 4, 5, 6));
    }
}
