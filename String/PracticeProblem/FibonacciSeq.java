import java.util.*;

public class FibonacciSeq {
    public static int getInput(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextInt();
    }
        public static void Fibonacci(int num) {
            int firstTerm = 0;
            int secondTerm = 1;
            System.out.print(firstTerm + " " + secondTerm + " ");
            for (int i = 2; i <= num; i++) {
                int nextTerm = firstTerm + secondTerm;
                System.out.print(nextTerm + " ");

                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }

    public static void main(String[] args) {
        int num = getInput("enter your number");
        System.out.println("Fibonacci Series up to " + num + ":");
        Fibonacci(num);

    }
}