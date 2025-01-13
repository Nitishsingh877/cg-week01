
import java.util.Scanner;

public class  SmandLRof3nos {

	public static int[] findSmallestAndLargest(int number1, int number2, int number3) 
{	  
	int smallest, largest;
// Finding smallest and largest numbers
        if (number1 <= number2 && number1 <= number3) {
            smallest = number1;
        } else if (number2 <= number1 && number2 <= number3) {
            smallest = number2;
        } else {
            smallest = number3;
        }

        if (number1 >= number2 && number1 >= number3) {
            largest = number1;
        } else if (number2 >= number1 && number2 >= number3) {
            largest = number2;
        } else {
            largest = number3;
        }
      
	 // Returning the smallest and largest in an array
        return new int[] {smallest, largest};
	
}
	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input  number
	
        System.out.print("Enter the number1 :  ");
        int number1  = input.nextInt();
	System.out.print("Enter the number2 :  ");
        int number2  = input.nextInt();
	System.out.print("Enter the number3 :  ");
        int number3  = input.nextInt();

	 // Calling the method to find smallest and largest
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Displaying the results
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);

	// Close the scanner
        input.close();
    }
}

