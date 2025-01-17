import java.util.Enumeration;
import java.util.Scanner;

public class FactorialUsingRecursion {
    public static int getInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        return input.nextInt();
    }

    public static int Fact(int num) {
        if(num ==0 ||  num ==1){
            return 1;
        }
        else {
            return num*Fact(num-1);
        }

    }
    public static void displayRes(int num, int res) {
        System.out.println("factorial of " + num + " is "+ res );
    }
    public static void main(String[] args) {
        int num = getInput();
        int res =  Fact(num);
        displayRes(num, res);

    }
}
