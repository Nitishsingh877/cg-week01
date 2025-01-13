import java.util.Scanner;

public class VowelConsonantCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the method to count vowels and consonants
        countVowelsAndConsonants(input);
    }

    public static void countVowelsAndConsonants(String input) {
        // Convert input to lowercase for easier comparison
        input = input.toLowerCase();

        // Initialize counters
        int vowelCount = 0;
        int consonantCount = 0;

        // Define vowels
        String vowels = "aeiou";

        // Loop through the characters of the string
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1) {
                    vowelCount++; // Increment vowel count if character is a vowel
                } else {
                    consonantCount++; // Increment consonant count otherwise
                }
            }
        }

        // Print the results
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}
