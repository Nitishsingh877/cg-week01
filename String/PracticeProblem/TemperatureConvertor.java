import java.util.Scanner;

public class TemperatureConvertor {
    public static int getInput(String prompt) {
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public static double C2Fconvertor(int c) {
        //formula c = c*9/5 + 32
        return  (c*9/5) + 32;
    }
    public static  double F2Cconvertor (int f) {
        // formula f-32/1.8
        return (f-32)/1.8;
    }
    public  static void displayDetails(int c,int f) {
        System.out.println("the degree " + c + " celsius in farhenhit is " + C2Fconvertor(c));
        System.out.println("the degree "+ f + " farhenhit in celsius is " + F2Cconvertor(f));
    }
    public static void main(String[] args) {
        int c = getInput("enter degree in celsius");
        int f = getInput("enter degree in farenhit");

        C2Fconvertor(c);
        F2Cconvertor(f);
        displayDetails(c,f);

    }
}
