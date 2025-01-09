import java.util.Scanner;

public class Printqnr {
	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input for number1, number2

        System.out.print("Enter the number1 :  ");
        int number1 = input.nextInt();
		
	System.out.print("Enter the number2 :  ");
        int number2 = input.nextInt();
	
        // Performing  operations

	double quotient = number1/number2;
	double reminder = number1%number2;
       	

        // Printing the results

        System.out.println("The Quotient is"+ quotient + "and Reminder is "+reminder+ "of two number " + number1 + " and "+ number2);
        
        // Close the scanner
        input.close();
    }
}