import java.util.*;

public class ArrayOutOfBoundException {
    public static String generateArrayOutOfBoundException(String[] s){
        return s[3];
    }
    public static String handlingArrayOutOfBoundException(String[] s){
        try{
            return s[3];
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of Bound exception occurred");
            return "siddhu";
        }
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        String[] arr = {"nitish","Singh"};
//        System.out.println("generate Array Index out of bound exception");
//        generateArrayOutOfBoundException(arr);
        System.out.println("Handling Array index out of bound exception using tru and catch");
        handlingArrayOutOfBoundException(arr);
    }

}