import java.util.Scanner;

public class TemperaturConversion   {
	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input for celsius 

        System.out.print("Enter the celsius :  ");
        double celsius  = input.nextDouble();
		
	
	
        // Performing  operations
	// Formulae Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F

	double Fahrenheit =   (celsius * 9/5) + 32;
	

        // Printing the results

        System.out.println(" The " +celsius+ " celsius is " +Fahrenheit+" fahrenheit");
        
        // Close the scanner
        input.close();
    }
}