import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().trim();

        //method call
       palindrome(input);
    }

    public static void palindrome(String input) {
        
	 // Initialize an empty string to store the reversed string
        String reversed = "";

         // Loop through the string in reverse order
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
 	// Append each character to the reversed string
        }
		if(input.equals(reversed)) {
		System.out.println("string is in palindrome");
}		else {
		System.out.println("string is not in palindrome");

		}
	}
}

