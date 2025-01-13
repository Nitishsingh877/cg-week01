import java.util.Scanner;

public class TemperaturConversionFtoC   {
	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input for celsius 

        System.out.print("Enter the fahrenheit  :  ");
        double fahrenheit   = input.nextDouble();
		
	
	
        // Performing  operations
	// Formulae Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F
	//formulae to convert Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C
	
 	double celsiusResult = (fahrenheit - 32) * 5/9;

        // Printing the results

        System.out.println(" The " +fahrenheit+ " fahrenheit is " +celsiusResult+" Celsius");
        
        // Close the scanner
        input.close();
    }
}