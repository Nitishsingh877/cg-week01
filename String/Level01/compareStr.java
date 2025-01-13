import java.util.*;

public class compareStr {
    public static boolean compareString(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        // Iterate through each character in the strings
        for (int i = 0; i < str1.length(); i++) {
            //compare each charcter
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        //if all match
        return true;
    }


    public static void main(String[] args) {
        //user input
        Scanner input = new Scanner(System.in);
        System.out.println("enter your first word");
        String str1 = input.next().trim();
        System.out.println("enter your second word");
        String str2 = input.next().trim();

        System.out.println("is " + str1 + " and " + str2 + " are equal: " + compareString(str1, str2));

    }
        }