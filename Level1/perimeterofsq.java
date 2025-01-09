import java.util.Scanner;

public class perimeterofsq {
	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input for side

        System.out.print("Enter the side:  ");
        double side = input.nextDouble();

        // Performing  operations
       	double perimeter = 4*side;

        // Printing the results
        System.out.println("The length of the side is "+ side +"whose perimeter is "+ perimeter );
        
        // Close the scanner
        input.close();
    }
}