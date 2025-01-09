import java.util.Scanner;

public class SimpleInterest    {
	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input  principal, rate, time
	//Simple Interest = Principal * Rate * Time / 100

	

        System.out.print("Enter the Principal :  ");
        double Principal   = input.nextDouble();
	
	System.out.print("Enter the Rate:  ");
        double Rate   = input.nextDouble();
	
	System.out.print("Enter the time:  ");
        double time   = input.nextDouble();
	
        // Performing  operations
	double SimpleInterest =  (Principal * Rate * time) / 100;

		

        // Printing the results

        System.out.println("The Simple Interest is "+SimpleInterest+"for Principal"+Principal+", Rate of Interest " +Rate+"and Time"+time);  

 // Close the scanner
        input.close();
    }
}