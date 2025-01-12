import java.util.Scanner;
import java.util.Arrays;

public class NumberCheckerExtended {

	 //methid for count the numbers
	 public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

	//methodx for store digit in arrays

	public static int[] storeDigits(int number) {
        int digits[] = new int[countDigits(number)];
        int i = digits.length - 1;
        while (number != 0) {
            digits[i] = number % 10;
            number /= 10;
            i--;
        }
        return digits;
    } 
	// sum of digits
	public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
	// sum of square
	public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
	// harshad number check
	public static boolean isHarshadNumber(int number) {
        int[] digits = storeDigits(number);
        int sumOfDigits = sumOfDigits(digits);
        return number % sumOfDigits == 0;
    }
	//frequecies of number
	 public static int[][] findDigitFrequencies(int[] digits) {
        int[][] frequencies = new int[10][2]; // 10 possible digits (0-9)

        for (int i = 0; i < 10; i++) {
            frequencies[i][0] = i; // Digit
            frequencies[i][1] = 0; // Frequency
        }

        for (int digit : digits) {
            frequencies[digit][1]++;
        }

        return frequencies;
    }

    public static void main(String[] args) {
	 int number = 153; // Example number

        System.out.println("Number of digits: " + countDigits(number));

        int[] digits = storeDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));

        System.out.println("Is Harshad Number: " + isHarshadNumber(number));

        int[][] frequencies = findDigitFrequencies(digits);
        System.out.println("Digit Frequencies:");
        for (int[] row : frequencies) {
            System.out.println(row[0] + " -> " + row[1]);
        }
    }
}
