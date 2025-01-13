import java.util.Scanner;
	
public class unitConvertorExtended{

	public static double convertYardsToFeet(double yards)  {
	double yards2feet = 3; 
	double res = yards*yards2feet;
	return res;
}

	public static double convertfeet2yards(double feet) {
	double feet2yards = 0.333333;
	double res = feet/feet2yards;
	return res;
} 	
	public static double convertmeters2inches(double meters) {
	double meters2inches = 39.3701;
	double res = meters*meters2inches;
	return res;
}	
	public static double convertinches2meters(double inches) {
	double inches2meters = 0.0254;
	double res = inches/inches2meters;
	return res;
}		
	public static double convertinches2cm(double inch) {
	double inches2cm = 2.54;
	double res = inch*inches2cm;
	return res;
}	
	
	public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input  number
	
        System.out.print("Enter the yards :  ");
        double yards  = input.nextDouble();
	System.out.print("Enter the feet :  ");
        double feet  = input.nextDouble();
	System.out.print("Enter the meters :  ");
        double meters = input.nextDouble();
	System.out.print("Enter the inches :  ");
        double inches  = input.nextDouble();	
	System.out.print("Enter the inches :  ");
        double inch  = input.nextDouble();


	
	System.out.println("convert yards To Feet result is : " + convertYardsToFeet(yards));
	System.out.println("convert feet to yards result is : " + convertfeet2yards(feet));
	System.out.println("convert meters to inches result is : " + convertmeters2inches(meters));
	System.out.println("convert inches to meters result is : " + convertinches2meters(inches));	
	System.out.println("convert inches to cm result is : " + convertinches2cm(inch));

	

	
	
	// Close the scanner
        input.close();
    }
}