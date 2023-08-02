package NHN20230802.practice;

public class Mathx {

    private Mathx() {}

    public static int fibonacci(int n) {

        // F0 = 0
        if (n == 0) {
            return 0;
        }
        
        else if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
}
