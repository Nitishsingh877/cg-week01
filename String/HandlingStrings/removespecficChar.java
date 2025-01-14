import  java.util.*;

public class removespecficChar {

        public static void modifiedString(String s, String r) {
            String remove = r;
            String result = s.replace(remove, "");
            System.out.println("After removing the char from word is : " + result);
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your word");
        String s =  sc.nextLine().trim();
        System.out.println("enter your removing word");
        String r =  sc.nextLine().trim();

        modifiedString(s,r);

        sc.close();
     }
}