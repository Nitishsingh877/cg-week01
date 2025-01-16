import java.util.Scanner;

public class lengthFind {
    public static int lengthOfString(String s) {
        int count =0;
        while (true){
            try{
                s.charAt(count);
                count++;
            }catch (IndexOutOfBoundsException e){
                System.out.println("index out of bound exception handled");
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter string");
        String s = input.nextLine();

        System.out.println("length of string is " + lengthOfString(s));
        System.out.println("length of string using length function" + s.length());


        input.close();
    }
}
