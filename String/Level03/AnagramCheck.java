import java.util.Scanner;

public class AnagramCheck {

    public static boolean areAnagrams(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }

        text1 = text1.toLowerCase();
        text2 = text2.toLowerCase();

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first text:");
        String text1 = scanner.nextLine();

        System.out.println("Enter the second text:");
        String text2 = scanner.nextLine();

        boolean result = areAnagrams(text1, text2);

        if (result) {
            System.out.println("The two texts are anagrams.");
        } else {
            System.out.println("The two texts are not anagrams.");
        }

        scanner.close();
    }
}

