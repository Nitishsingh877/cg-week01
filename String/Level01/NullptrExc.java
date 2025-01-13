import  java.util.*;

public class NullptrExc {
    public static void generateNullPtrExeption(String s){
        System.out.println(s.length());
    }
    public static void handleNullPtrExeption(String s){
        try{
            System.out.println(s.charAt(3));
        } catch (NullPointerException e){
            System.out.println("a null pointer exception occured");
        }
    }

    public static void main(String[] args) {
        String s = null;
//                System.out.println("Example of generating the ecxeption ");
//        genNullPtrExeption(s);
        System.out.println("example ofhandling the exception");
        handleNullPtrExeption(s);
  }

}

