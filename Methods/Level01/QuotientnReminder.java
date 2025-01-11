
import java.util.Scanner;

public class  QuotientnReminder {

	public static int[] findRemainderAndQuotient(int number, int divisor) 
 
{	  
	      int quotient = number/divisor;
	      int reminder = number%divisor;

	 // Returning the reminder and quotient
        return new int[] {quotient, reminder};
	
}
	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input  number
	
        System.out.print("Enter the number :  ");
        int number  = input.nextInt();
	System.out.print("Enter the divisor :  ");
        int divisor  = input.nextInt();
	

	 // Calling the method to find smallest and largest
        int[] result = findRemainderAndQuotient(number, divisor);

        // Displaying the results
        System.out.println("quotient is: " + result[0]);
        System.out.println("reminder is: " + result[1]);

	// Close the scanner
        input.close();
    }
}

