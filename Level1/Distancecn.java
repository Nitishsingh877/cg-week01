import java.util.Scanner;

public class Distancecn {
	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input for distanceinFeet

        System.out.print("Enter the distance in Feet:  ");
        double distanceinFeet = input.nextDouble();

        // Performing  operations
	double yards = distanceinFeet/3;
	double miles = yards/1760;
       	

        // Printing the results
        System.out.println("the distance in feets is "+ distanceinFeet +"while in yards " +  String.format("%.2f", yards) + "and mile is " + String.format("%.2f", miles));
        
        // Close the scanner
        input.close();
    }
}