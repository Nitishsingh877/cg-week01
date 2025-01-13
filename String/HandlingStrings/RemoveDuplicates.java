import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Call the removeDuplicates method
        String result = removeDuplicates(input);
        
        // Print the modified string without duplicates
        System.out.println("String after removing duplicates: " + result);
    }

    // Method to remove duplicate characters
    public static String removeDuplicates(String str) {
        // Create an empty string to store the result
        StringBuilder result = new StringBuilder();
        
        // Convert the string to a character array
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            
            // If the character is not already in the result, add it
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }
        
        // Return the modified string
        return result.toString();
    }
}
