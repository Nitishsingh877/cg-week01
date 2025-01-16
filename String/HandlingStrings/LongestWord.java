import java.util.Scanner;

public class LongestWord {


 // Method to find the longest word in a sentence

    public static String findLongestWord(String sentence) {
        
	// Split the sentence into words using spaces as a delimiter
        String[] words = sentence.split("\\s+");

        // Initialize variables to keep track of the longest word
        String longestWord = "";
        
        // Loop through the words to find the longest one
        for (String word : words) {
            // If the current word is longer than the longestWord, update longestWord
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // Return the longest word found
        return longestWord;
    }


    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Call the method to find the longest word
        String longestWord = findLongestWord(sentence);

        // Output the longest word
        System.out.println("The longest word in the sentence is: " + longestWord);
    }
   }
