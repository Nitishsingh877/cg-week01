import java.util.Scanner;

    public class vowelsAndConsonant2D {
        public static String checkAlphabets(char ch) {
            if (Character.isLetter(ch)) { // Check if it's a letter
                char cha = Character.toLowerCase(ch); // Convert to lowercase
                if (cha == 'a' || cha == 'e' || cha == 'i' || cha == 'o' || cha == 'u') {
                    return "vowel";
                } else {
                    return "consonant";
                }
            }
            return "Not a letter";
            }
        public static String[][] findVowelsAndConsonants(String s) {
            int length = s.length();
            String[][] result = new String[length][2];

            for (int i = 0; i < length; i++) {
                char ch = s.charAt(i);
                result[i][0] = String.valueOf(ch); // Store the character
                result[i][1] = checkAlphabets(ch);
            }
            return result;
        }
        // Method to display the 2D array in a tabular format
        public static void displayArray(String[][] array) {
            System.out.printf("%-10s %-15s%n", "Character", "Type");
            System.out.println("---------------------------");
            for (String[] row : array) {
                System.out.printf("%-10s %-15s%n", row[0], row[1]);
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string:");
            String input = sc.nextLine();

            // Find vowels and consonants
            String[][] result = findVowelsAndConsonants(input);

            // Display the 2D array in a tabular format
            displayArray(result);

            sc.close();
        }
    }


