import java.util.*;

public class lowerCase {
    public static String toLower(String s){
        String temp = "";
        for(int i=0; i<s.length();i++){
            char it = s.charAt(i);
            if(Character.isUpperCase(it)){
                temp += String.valueOf((char)(it+32));
            }else {
                temp += String.valueOf(it);
            }
        }
        return  temp;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine().trim();

        String lowerString1 = toLower(s);
        String  lowerString2 = s.toLowerCase();
        if(lowerString1.equals(lowerString2))
            System.out.println("Both are equal ");
        else
            System.out.println("Both are Different");
        System.out.println("The Strings are "+lowerString1+" and "+lowerString2);

        scanner.close();
    }
}