import java.util.Scanner;

public class Armstrong  {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

//Armstrong Number is a number whose Sum of cubes of each digit results in the original number e.g. 153 = 1^3 + 5^3 + 3^3


        // Ask the user input a  = variables named number 
        System.out.print("Enter a   number: ");
        int number = input.nextInt();
	int sum = 0;
	int originalNumber = number;
	

	while(number !=0){
	int reminder = number%10;
	int remCube = reminder*reminder*reminder;
	sum += remCube;

	number = number/10;	
}
	 // Check if the sum is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
	
	// Close the scanner
        input.close();
    }
}