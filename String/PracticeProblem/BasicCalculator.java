import java.util.Scanner;

public class BasicCalculator {
    public static int getInput (String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextInt();
    }
    public static String opInput (String promptop) {
        Scanner input = new Scanner(System.in);
        System.out.println(promptop);
        return input.nextLine().trim();
    }
    public static void getvalue(int a,int b, String op) {
        if (op.equals( "+")) {
            System.out.println("the sum is " + (a+b));
        } else if (op.equals("-")) {
            System.out.println("the diffrence is " + (a-b));
        } else if (op.equals("*")) {
            System.out.println("the product is " + (a*b));
        }else if(op.equals("/")) {
            System.out.println("the quotient is " + (a/b));
        }else {
            System.out.println("invalid operations");
        }
    }


    public static void main(String[] args) {
        int a = getInput("enter first number");
        int b = getInput("enetr second number");
        String op = opInput("enter the operator to perform operations");

        getvalue(a,b,op);



    }
}
