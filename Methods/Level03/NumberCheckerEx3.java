import java.util.Arrays;

public class NumberCheckerEx3 {
//count the digit

    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
// store the digit
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
//reverse of an aarray
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }
// array equal or not

    public static boolean arraysAreEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
//palindrome check
    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseArray(digits);
        return arraysAreEqual(digits, reversedDigits);
    }
// dock or zero in number check

    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 121; // Example number

        System.out.println("Number of digits: " + countDigits(number));

        int[] digits = storeDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        int[] reversedDigits = reverseArray(digits);
        System.out.println("Reversed Digits: " + Arrays.toString(reversedDigits));

        System.out.println("Is Palindrome: " + isPalindrome(number));
        System.out.println("Is Duck Number: " + isDuckNumber(number));
    }
}