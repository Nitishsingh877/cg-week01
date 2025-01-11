import java.util.Scanner;
	
public class unitConvertor{

	public static double convertKmToMiles(double km) {
	double km2miles = 0.621371; 
	double res = km*km2miles;
	return res;
}

	public static double convertmiles2km(double miles) {
	double miles2km = 1.60934;
	double res = miles *miles2km;
	return res;
} 	
	public static double convertmeters2feet(double meters) {
	double meters2feet = 3.28084;
	double res = meters*meters2feet;
	return res;
}	
	public static double convertfeet2meters(double feet) {
	double feet2meters = 0.3048;
	double res = feet	*feet2meters;
	return res;
}	
	
	public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input  number
	
        System.out.print("Enter the km :  ");
        double km  = input.nextDouble();
	System.out.print("Enter the miles :  ");
        double miles  = input.nextDouble();
	System.out.print("Enter the meter :  ");
        double meter = input.nextDouble();
	System.out.print("Enter the feet :  ");
        double feet  = input.nextDouble();

	
	System.out.println("convert Km To Miles result is : " + convertKmToMiles(km));
	System.out.println("convert miles to km result is : " + convertmiles2km(miles));
	System.out.println("convert meters to feet result is : " + convertmeters2feet(meter));
	System.out.println("convert feet to metersresult is : " + convertfeet2meters(feet));

	

	
	
	// Close the scanner
        input.close();
    }
}