import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        // Find the count of digits
        int temp = number;
        int digitCount = 0;
        while (temp > 0) {
            digitCount++;
            temp /= 10;
        }

        // Store the digits in an array
        int[] digits = new int[digitCount];
        temp = number;
        for (int i = 0; i < digitCount; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Display the digits in reverse order
        System.out.print("The reversed number is: ");
          	for (int i = 0; i < digitCount; i++) {
            	System.out.print(digits[i]);
        }
scanner.close();
    }
}
