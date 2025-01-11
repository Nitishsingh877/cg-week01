
import java.util.Scanner;

public class numAnalysis {

 // Method to check if a number is positive
    public static boolean isPositive(int number) {
        return number >= 0;
    }
// Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
// Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }


	
   
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
	 int[] numbers = new int[5];

        // Take input for 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }


	// Process each number
        System.out.println("\nAnalysis:");
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                System.out.print("Number " + numbers[i] + " is positive and ");
                if (isEven(numbers[i])) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else {
                System.out.println("Number " + numbers[i] + " is negative.");
            }
        }
	

	        // Compare the first and last numbers
        int comparison = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.print("\nComparison of the first and last numbers: ");
        if (comparison > 0) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparison == 0) {
            System.out.println("The first number is equal to the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }

	

        // Close the scanner
        input.close();
    }
}

