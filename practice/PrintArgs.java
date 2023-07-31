package practice;

public class PrintArgs {
    public static void main(String[] args) {
        /**
         * [terminal -> command]
         * javac practice\PrintArgs
         * java practice.PrintArgs 1 2 3
         * output : 1 2 3
         */
        for (String arg : args) {
            System.out.print(arg + " ");
        }
        System.out.println();
        System.out.println("args length : " + args.length);
    }
}