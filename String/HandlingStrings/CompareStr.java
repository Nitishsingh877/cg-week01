import java.util.Scanner;

public class CompareStr {


 // Method to compare string

    public static int comparestr(String str1, String str2) {
        
		int len1 = str1.length();
		int len2 = str2.length();
		int minLength = Math.min(len1, len2);

		 for (int i = 0; i < minLength; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if (char1 < char2) {
                return -1; // str1 comes before str2
            } else if (char1 > char2) {
                return 1; // str2 comes before str1
            }
        }
		 // If all characters are equal up to the length of the shorter string
        if (len1 < len2) {
            return -1; // str1 comes before str2 (shorter)
        } else if (len1 > len2) {
            return 1; // str2 comes before str1 (shorter)
        } else {
            return 0; // Strings are equal
        }

			
    }
	    
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a sentence
        System.out.print("Enter first words: ");
        String str1 = scanner.nextLine();
	System.out.print("Enter Second words: ");
        String str2 = scanner.nextLine();
	
       int result =  comparestr(str1, str2);

        if (result < 0) {
            System.out.println(str1 + " comes before " + str2);
        } else if (result > 0) {
            System.out.println(str2 + " comes before " + str1);
        } else {
            System.out.println(str1 + " and " + str2 + " are equal");
        }  
 }
   }
