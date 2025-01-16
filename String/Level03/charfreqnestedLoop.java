
import java.util.Scanner;

public class charfreqnestedLoop {

    public static String[] findCharacterFrequency(String text) {
        char[] chars = text.toCharArray();
        int length = chars.length;
        int[] freq = new int[length];
        String[] result = new String[length];

        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                int count = 1;

                for (int j = i + 1; j < length; j++) {
                    if (chars[i] == chars[j]) {
                        count++;
                        chars[j] = '0';
                    }
                }

                result[i] = String.valueOf(chars[i]) + " = " + count;
            }
        }

        return result;
    }

    public static void displayCharacterFrequency(String[] result) {
        System.out.println("Character Frequency:");
        for (String res : result) {
            if (res != null) {
                System.out.println(res);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = scanner.nextLine();

        String[] result = findCharacterFrequency(text);

        displayCharacterFrequency(result);

        scanner.close();
    }
}
