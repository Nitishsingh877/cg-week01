import java.util.Scanner;

public class rounds  {
	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input   side1, side2, side3
	//variable bonus and take user input

        System.out.print("Enter the side1  :  ");
        double side1   = input.nextDouble();
	
	System.out.print("Enter the side2  :  ");
        double side2   = input.nextDouble();

	System.out.print("Enter the side3  :  ");
        double side3   = input.nextDouble();
		
		
	
	
        // Performing  operations
		double perimeter = side1+side2+side3;
		double numberOfRounds = perimeter/5;
                 
 	

        // Printing the results

        System.out.println("The total number of rounds the athlete will run is" +numberOfRounds+" to complete 5 km");  

 // Close the scanner
        input.close();
    }
}