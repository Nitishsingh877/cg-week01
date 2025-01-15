
import java.util.Scanner;

public class SplitText {
    public static String[] splitString(String s){
        int size = 1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ')
                size++;
        }

        String[] answer = new String[size];
        int id = 0;
        String temp = "";

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                answer[id++] = temp;
                temp = "";
            }
            else{
                temp+=s.charAt(i);
            }
        }
        answer[id] = temp;
        return answer;
    }
    public static boolean compare(String[] arr1 , String[] arr2){
        if(arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if(!arr1[i].equals(arr2[i]))
                return false;

        }
        return true;
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = sc.nextLine();
        // calling use defined split method
        String[] splited1 = splitString(s);
        String[] splited2 = s.split(" ");

        if(compare(splited2,splited1))
            System.out.println("Both are equal");
        else
            System.out.println("Both are different;");

    }
}
