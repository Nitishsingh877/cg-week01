
import java.util.Scanner;

public class SplitText {
    public static int findLength(String s) {
        //count the strings
        int count = 0;
        try {
            while (true) {
                s.charAt(count); // Access characters until IndexOutOfBoundsException
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception caught when index exceeds the string length
        }
        return count;
    }
    //method to split into words
    public static String[] customSplit(String text) {
        int length = findLength(text);

        // Count the number of words and store space indexes
        int wordCount = 1; // At least one word is present
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        // Extract words using space indexes
        String[] words = new String[wordCount];
        int wordStart = 0, wordIndex = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex] = text.substring(wordStart, i);
                wordIndex++;
                wordStart = i + 1;
            }
        }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

    }
}
