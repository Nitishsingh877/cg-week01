import java.util.Scanner;

public class AreaofaTriangle {
	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input for base and height

        System.out.print("Enter the base:  ");
        double base = input.nextDouble();

        System.out.print("Enter the height: ");
        double height = input.nextDouble();

        // Performing  operations
       	double area = 0.5*base*height;

        // Printing the results
        System.out.println("Your Height in cm is " + height + " and base is "+
 base + "and area is"+ area);
        
        // Close the scanner
        input.close();
    }
}
