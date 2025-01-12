import java.util.Scanner;
import java.util.Arrays;

public class NumberChecker {

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
	//method for check number is duck or not
	 
	public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }

	//method for armstronng nummber
	public static boolean isArmstrongNumber(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        int n = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, n);
        }
        return sum == number;
    }
	
// largest and smalllest method
	 public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        return new int[]{smallest, secondSmallest};
    }



    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("enter your number");
	int number = input.nextInt();

        System.out.println("Number of digits: " + countDigits(number));

        int[] digits = storeDigits(number);

        System.out.println("Digits: " + Arrays.toString(digits));

        System.out.println("Is Duck Number: " + isDuckNumber(number));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number));

        int[] largestAndSecondLargest = findLargestAndSecondLargest(digits);

        System.out.println("Largest: " + largestAndSecondLargest[0] + ", Second Largest: " + largestAndSecondLargest[1]);

        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digits);

        System.out.println("Smallest: " + smallestAndSecondSmallest[0] + ", Second Smallest: " + smallestAndSecondSmallest[1]);
    }
}

