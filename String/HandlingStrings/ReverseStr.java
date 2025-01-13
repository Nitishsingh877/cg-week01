import java.util.Scanner;

public class ReverseStr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().trim();

        // Call the method to count vowels and consonants
        String reversed = reverseString(input);

	// Print the reversed string
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String input) {
        
	 // Initialize an empty string to store the reversed string
        String reversed = "";

         // Loop through the string in reverse order
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); // Append each character to the reversed string
        }
        
        return reversed;
          }
}
