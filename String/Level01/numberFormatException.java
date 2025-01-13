import java.util.*;

public class numberFormatException {
    public static int generateNumberFormatException(String s){
        return Integer.parseInt(s);
    }
    public static int handleNumberFormatException(String s){
        try{
            return Integer.parseInt(s);
        }
        catch (java.lang.NumberFormatException e){
            System.out.println("Please insert the number in the string ");
            return -1;
        }
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        String s = "ab";
//        System.out.println("Generating the Number format exception");
//        generateNumberFormatException(s);
        System.out.println("Handling the Number format exception");
        handleNumberFormatException(s);
    }

}