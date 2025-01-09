import java.util.Scanner;

public class Totalprice {
	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input for unitPrice,quantity

        System.out.print("Enter the unitPrice:  ");
        double unitPrice = input.nextDouble();
	
	System.out.print("Enter the quantity:  ");
        double quantity = input.nextDouble();

        // Performing  operations

	double totalPrice =unitPrice*quantity;
	
       	

        // Printing the results

        System.out.println("The total purchase price is INR" + totalPrice + " if the quantity " + quantity + "and unit price is INR" + unitPrice );
        
        // Close the scanner
        input.close();
    }
}