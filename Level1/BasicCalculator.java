import java.util.Scanner;

public class BasicCalculator {
	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input for two numbers

        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        // Performing arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
	double division = number1/number2;

        // Printing the results
        System.out.println("The addition, subtraction, multiplication, and division of " + number1 + " and " + number2 + " are:" + addition + ","+subtraction+","+multiplication +"and" + division);
        
        // Close the scanner
        input.close();
    }
}
