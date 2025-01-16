import java.util.*;

public class MaxOfThreeNumbers {

    public static int getInput(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextInt();
     }
    public  static int maxOfNumbers(int a,int b,int c) {
        int max = Math.max(a,(Math.max(b,c)));
        return max;
    }

    public static void main(String[] args) {
        // Taking inputs from the user
        int a = getInput("Enter the first number: ");
        int b = getInput("Enter the second number: ");
        int c = getInput("Enter the third number: ");

        System.out.println("the maximum of three nummbers are " + maxOfNumbers(a,b,c));
    }
}
