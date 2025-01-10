import java.util.Scanner;

public class SumTillZeroorNeg {
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for the starting value of the Summ

	double total = 0.0;
	double number;

	System.out.println("Enter numbers to sum them up. Enter 0 to stop.");
	System.out.println("Enter the  number for the Sum: ");
	number = input.nextDouble();

	        

        // taking while loop
	while(true) {
	if(number <= 0){
	break;
} 	else {
	total += number;
	System.out.println("enter the number");
	double temp = input.nextDouble();
	number = temp;
	}
}
	System.out.println("Sum of entered numbers: " + total);
	

	// Close the scanner
        input.close();
    }
}