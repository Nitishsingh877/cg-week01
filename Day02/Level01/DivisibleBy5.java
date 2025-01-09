import java.util.Scanner;

public class  DivisibleBy5 {
	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input number is divisible by 5
	
        System.out.print("Enter the number :  ");
        double number   = input.nextDouble();
	
        // Performing  operations
	double reminder = number%5;

	if(reminder == 0) {
     		System.out.println("Yes!");
}
	else {
		System.out.println("No!");

}
		
        // Close the scanner
        input.close();
    }
}