import java.sql.SQLOutput;
import java.util.Arrays;
import  java.util.Scanner;

public  class anagrams {
            public static boolean checkAnagrams(String str1, String str2) {
                if(str1.length() != str2.length()){
                    return false;
                }
                char[] charArray1 = str1.toCharArray();
                char[] charArray2 = str2.toCharArray();

                //sort the chararray
                 Arrays.sort(charArray1);
                 Arrays.sort(charArray2);

                return (Arrays.equals(charArray1,charArray2));
            }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your first word");
        String str1 = sc.nextLine().trim();
        System.out.println("enter your second word");
        String str2 = sc.nextLine().trim();

//        method call
        boolean result = checkAnagrams(str1,str2);

        //output
        System.out.println(result +" for" + str1 + str2 + " are anagrams");
    }
}