import java.util.Scanner;

public class PalindromeCheck {

    public static boolean isPalindromeLogic1(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static boolean isPalindromeLogic2(String text, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return isPalindromeLogic2(text, start + 1, end - 1);
    }

    public static boolean isPalindromeLogic3(String text) {
        String reversed = reverseString(text);

        return text.equals(reversed);
    }

    public static String reverseString(String text) {
        StringBuilder reversed = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }
        return reversed.toString();
    }

    public static void testPalindromeMethods(String text) {
        boolean resultLogic1 = isPalindromeLogic1(text);
        boolean resultLogic2 = isPalindromeLogic2(text, 0, text.length() - 1);
        boolean resultLogic3 = isPalindromeLogic3(text);

        System.out.println("Using Logic 1 Start-End Comparison: " + (resultLogic1 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Using Logic 2 Recursive Comparison: " + (resultLogic2 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Using Logic 3 Reverse String Comparison: " + (resultLogic3 ? "Palindrome" : "Not Palindrome"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text to check if it is a palindrome:");
        String text = scanner.nextLine();

        testPalindromeMethods(text);

        scanner.close();
    }
}

