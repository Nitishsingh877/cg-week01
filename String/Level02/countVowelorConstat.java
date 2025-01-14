import java.util.Scanner;

public class countVowelorConstat {
    public static void checkAlphabets(String s) {
        String res = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = res.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel");
            } else if (Character.isLetter(ch)) {
                System.out.println(ch + " is constant");
            } else {
                System.out.println(ch + "is not a alphabet char");
            }
        }
    }

    public static int[] countVowels(String s) {
        String res = s.toLowerCase();
        int vowelcount = 0;
        int constantCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = res.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelcount++;
            }else {
                constantCount++;
            }
        }return new int[]{vowelcount, constantCount};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
//method for check alphabet
        checkAlphabets(s);

//method for counting
        int [] res = countVowels(s);
        System.out.println("the number of vowels is "+ res[0] + "consonant is" + res[1]);
    }
}
