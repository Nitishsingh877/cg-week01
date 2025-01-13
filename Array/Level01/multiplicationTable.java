import java.util.Scanner;

public class multiplicationTable  {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
	System.out.println("Enter the number");
	int number = input.nextInt();


//define an array
          int[] multiplicationTable = new int[10];


// Calculate the multiplication table and store the results in the array
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i -1] = number * i;
        }
	

// Display the multiplication table
        System.out.println("\nMultiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationTable[i-1]);
        }


// Close the scanner
        input.close();
    }
}