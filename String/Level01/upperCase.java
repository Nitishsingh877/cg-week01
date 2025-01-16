import java.util.*;
public class upperCase {

public static String toUpper(String s) {
    String temp = "";
    for(int i=0; i<s.length(); i++){
        char it = s.charAt(i);
        if(Character.isLowerCase(it)){
        temp += String.valueOf((char)(it-32));
        }else {
        temp += String.valueOf(it);
        }
        }
        return  temp;
        }



public static void main(String[]args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String s = scanner.nextLine().trim();

    String upperString1 = toUpper(s);
    String uppperString2 = s.toUpperCase();
    if (upperString1.equals(uppperString2))
        System.out.println("Both are equal ");
    else
        System.out.println("Both are Different");
    System.out.println("The Strings are " + upperString1 + " and " + uppperString2);

    scanner.close();

}
        }