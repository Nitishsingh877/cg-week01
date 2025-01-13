import java.util.Scanner;

public class Handshakes {
	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input for numberOfStudent

        System.out.print("Enter the numberOfStudent:  ");
        int numberOfStudent = input.nextInt();
	
        // Performing  operations

	int possiblehHandshakes =(numberOfStudent*(numberOfStudent-1))/2;
	
       	

        // Printing the results

        System.out.println(" the maximum number of possible handshakes is " +  possiblehHandshakes);
        
        // Close the scanner
        input.close();
    }
}