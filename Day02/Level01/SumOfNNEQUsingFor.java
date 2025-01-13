import java.util.Scanner;

public class SumOfNNEQUsingFor {
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for the starting value of the Summ

	System.out.println("Enter the  number for the Sum: ");
	double number = input.nextDouble();
	double total = 0.0;

	//manual cal
	double result = (number*(number+1))/2;
	System.out.println("sum is using while manual : " + result);

        // taking for loop
	for(int i=1; i<=number; i++){
	total += i;
	}
	
	System.out.println("sum is using for loop : " + total);

	// Close the scanner
        input.close();
    }
}