import java.util.Scanner;

public  class illegalArgumentExc {

    public static void generateIllegalArgumentException(String s){
        String subString = s.substring(5,3);
    }
    public static void handleIllegalArgumentException(String s){
        try {
            String subString = s.substring(5, 3);
        }
        catch (Exception e){
            System.out.println("Illegal Argument Exception occurred ::::: ");

        }
    }

    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);

        String s = sc.next().trim();

//        System.out.println("Generating the Illegal argument exception");
//        generateIllegalArgumentException(s);
        System.out.println("Handling the exception using the try and catch ");
        handleIllegalArgumentException(s);
    }
}


