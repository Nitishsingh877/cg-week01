import java.util.Scanner;

public class Swap   {
	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input   number1, number2
	//variable bonus and take user input

        System.out.print("Enter the number1  :  ");
        double number1   = input.nextDouble();
	
	System.out.print("Enter the number2  :  ");
        double number2   = input.nextDouble();
		
	
	
        // Performing  operations
		
 	double temp = number1;
	number1 = number2;
	number2 = temp;

        // Printing the results

        System.out.println("The swapped numbers are" +number1 +" and " +number2);


        // Close the scanner
        input.close();
    }
}