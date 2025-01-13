import java.util.Scanner;

public class showSum  {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
	double total = 0.0;
	int index = 0;
 		
//define an array
          double[] value = new double[10];
   	  System.out.println("Enter up to 10 positive numbers. Enter 0 or a negative number to stop:");

	  while(true) {
	    System.out.print("Enter a number: ");
            double userInput = input.nextDouble();
// Check for 0 or negative number to break the loop
            if (userInput <= 0) {
                break;
            }

            // Check if the array is full
            if (index >= 10) {
                System.out.println("Maximum limit of 10 numbers reached.");
                break;
            }

// Store the number in the array and increment the index
            value[index] = userInput;
            index++;
        }

 // Calculate the total and display all the numbers
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(value[i]);
            total += value[i];
        }

  // Display the total
        System.out.println("Sum of all numbers: " + total);
		
		
// Close the scanner
        input.close();
    }
}