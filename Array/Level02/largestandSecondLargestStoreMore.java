
import java.util.Scanner;

class largestandSecondLargestStoreMore {
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);
//taken number input
	System.out.println("Enter a number");
	int number = input.nextInt();

// Create arrays to store digits
	    int maxDigit = 10;
            int[] digits = new int[maxDigit];
	    int index = 0;

//extract digit and store in array

		while(number != 0) {
		 if (index == maxDigit) {
                
// Increase the size of the array dynamically
                maxDigit += 10; // Increase maxDigit by 10
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp; // Assign the expanded array back to digits

            }
            digits[index] = number % 10; // Extract last digit
            number /= 10; // Remove last digit
            index++;
        }
 // Find the largest and second-largest digits
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = digits[i];    // Update largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
 // Display results
        System.out.println("Digits in the number: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        System.out.println("Largest digit: " + largest);
        if (secondLargest == -1) {
            System.out.println("Second largest digit: Not found (only one unique digit present)");
        } else {
            System.out.println("Second largest digit: " + secondLargest);
        }
        

       // Close the Scanner Object
      input.close();
   }
}


