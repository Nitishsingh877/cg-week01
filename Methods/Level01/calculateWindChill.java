import java.util.Scanner;
	
public class  calculateWindChill{

	public static double WindChill(double temperature, double windSpeed)
 
{	  
	     double windChillResult = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * windSpeed;
		return windChillResult;
}
	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input  number
	
        System.out.print("Enter the temperature :  ");
        double temperature  = input.nextDouble();
	System.out.print("Enter the windSpeed :  ");
        double windSpeed  = input.nextDouble();
	

	 // calling method 
 	//double result =  WindChill(temperature,windSpeed);
        // Displaying the results
        System.out.println("the windchill is" +WindChill(temperature,windSpeed));
        

	// Close the scanner
        input.close();
    }
}
