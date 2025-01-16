
import java.util.Scanner;

public class uniqueCharFrequency {

    public static char[] uniqueCharacters(String text) {
        int[] freq = new int[256];
        int uniqueCount = 0;
//find frequency
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] == 0) {
                uniqueCount++;
            }
            freq[ch]++;
        }

        char[] uniqueChars = new char[uniqueCount];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueChars[index++] = (char) i;
            }
        }

        return uniqueChars;
    }

    public static String[][] findCharacterFrequency(String text) {
        int[] freq = new int[256];
        char[] uniqueChars = uniqueCharacters(text);

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return result;
    }

    public static void displayCharacterFrequency(String[][] result) {
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "        | " + result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = scanner.nextLine();

        String[][] result = findCharacterFrequency(text);

        displayCharacterFrequency(result);

        scanner.close();
    }
}

