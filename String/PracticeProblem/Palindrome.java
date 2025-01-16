import java.util.*;

public class Palindrome {
    public static String getInput(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return  input.nextLine();
    }
    public static String revesreString (String s){
        String revString =new StringBuilder(s).reverse().toString();
        return revString;
    }
    public static boolean checkPalindrome(String s, String revString) {
        if(s.equals(revString)){
            return true;
        }return false;
    }

    public static void main(String[] args) {
        String s = getInput("enter the string");
        String revString = revesreString(s);

        System.out.println("the string " + s + " is in palindrome? :" + checkPalindrome(s,revString));
    }

}