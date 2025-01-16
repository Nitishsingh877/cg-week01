import java.util.*;

public class SubstringFind {
    public static String createSubstring(String str, int startIndex, int endIndex) {
        StringBuilder sb = new StringBuilder();
        for (int i = startIndex; i <= endIndex; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String text = scanner.nextLine();

            System.out.print("Enter the start index: ");
            int start = scanner.nextInt();

            System.out.print("Enter the end index: ");
            int end = scanner.nextInt();

            String substring1 = createSubstring(text, start, end);
            String substring2 = text.substring(start, end + 1); // substring() uses inclusive start and exclusive end

            System.out.println("Substring using charAt(): " + substring1);
            System.out.println("Substring using substring(): " + substring2);

            if (compareStrings(substring1, substring2)) {
                System.out.println("The two substrings are equal.");
            } else {
                System.out.println("The two substrings are not equal.");
            }

            scanner.close();
    }
}