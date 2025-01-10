import java.util.Scanner;

public class HarshaNumber  {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask the user input a  = variables named number 
        System.out.print("Enter a   number: ");
        int number = input.nextInt();
	int sum = 0;
	int originalNumber = number;

	while(number !=0){
	number = number%10;
	sum += number;
	number = number/10;
	
}
 	// Check if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }
        
	
	// Close the scanner
        input.close();
    }
}