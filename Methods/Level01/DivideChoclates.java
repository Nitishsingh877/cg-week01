import java.util.Scanner;

public class  QuotientnReminder {

	public static int[] DivideChoclates(int numberOfChildren , int numberOfchocolates ) 
 
{	  
	      int choclatesGotByChild = numberOfChildren/numberOfchocolates;
	      int numberofRemainingChoclates = numberOfChildren%numberOfchocolates;

	 // Returning the choclatesGotByChild and numberofRemainingChoclates
        return new int[] {choclatesGotByChild, numberofRemainingChoclates};
	
}
	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input  number
	
        System.out.print("Enter the numberOfChildren :  ");
        int numberOfChildren  = input.nextInt();
	System.out.print("Enter the numberOfchocolates :  ");
        int numberOfchocolates  = input.nextInt();
	

	 // Calling the method to find smallest and largest
        int[] result = DivideChoclates(numberOfChildren, numberOfchocolates);

        // Displaying the results
        System.out.println("choclatesGotByChild is: " + result[0]);
        System.out.println("numberofRemainingChoclates is: " + result[1]);

	// Close the scanner
        input.close();
    }
}