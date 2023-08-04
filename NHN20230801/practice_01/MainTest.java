package NHN20230801.practice_01;

public class MainTest {
    
    // static -> class 안에 있는 어느곳이든 호출 가능
    static String msg = "Hello, world!";

    public static void f() {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        System.out.println(msg);
        f();
    }
}
