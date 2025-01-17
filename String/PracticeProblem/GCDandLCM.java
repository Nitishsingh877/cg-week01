import java.util.Scanner;

public class GCDandLCM {
    public static int getInput() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public static int GCD(int num1, int num2) {
        while (num2 != 0) {
            int temp =num2;
            num2 = num1%num2;
            num1 = temp;
        } return num1;
    }
    public  static  int LCM(int num1,int num2) {
        return (num1*num2)/GCD(num1,num2);
    }
    public static void main(String[] args) {
        System.out.println("enter first number");
        int num1 = getInput();
        System.out.println("enter second number");
        int num2 = getInput();

        System.out.println("the GCD is " + GCD(num1,num2));
        System.out.println("the Lcm is "+ LCM(num1,num2));

    }
}
