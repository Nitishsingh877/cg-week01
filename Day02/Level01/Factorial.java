import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for the starting value of the Factorial

	System.out.println("Enter the  number for the Factorial: ");
	double number = input.nextDouble();
	double total = 1.0;

	// taking while loop
	while(number >= 1) {
	total = total*number;
	number--;
	}	
	System.out.println("sum is using for loop : " + total);

	// Close the scanner
        input.close();
    }
}