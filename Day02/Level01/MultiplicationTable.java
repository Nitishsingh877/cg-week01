import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number to display its multiplication table: ");
        int number = input.nextInt();

        System.out.println("Multiplication table for " + number + " from 6 to 9:");

        // Use a for loop to generate the table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        // Close the scanner
        input.close();
    }
}
