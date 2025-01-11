import java.util.Scanner;
	
public class  trignometricfn{

	public static double[] calculateTrigonometricFunctions(double angle) 
{	  
	// Convert the angle from degrees to radians

        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

	// Return the results as an array
        return new double[] {sine, cosine, tangent};
}
	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input  number
	
        System.out.print("Enter the anglein degree :  ");
        double angle  = input.nextDouble();
	


	 // Calling the method to calculate trigonometric functions
        double[] results = calculateTrigonometricFunctions(angle);

        // Displaying the results
        System.out.printf("Sine(%f°): %f%n", angle, results[0]);
        System.out.printf("Cosine(%f°): %f%n", angle, results[1]);
        System.out.printf("Tangent(%f°): %f%n", angle, results[2]);

	// Close the scanner
        input.close();
    }
}