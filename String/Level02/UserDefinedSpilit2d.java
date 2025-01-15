import  java.util.Scanner;

public class UserDefinedSpilit2d {
    public static String[][] splitString(String s){
        int size = 1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ')
                size++;
        }
        String[][] answer = new String[size][2];
        int id = 0;
        String temp = "";

        for (int i = 0; i < s.length(); i++) {


            if(s.charAt(i) == ' ') {
                answer[id][0] = temp;
                answer[id++][1] = String.valueOf(temp.length());
                temp = "";
            }
            else{
                temp+=s.charAt(i);
            }



        }
        answer[id][0] = temp;
        answer[id][1] = String.valueOf(temp.length());
        return answer;
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = sc.nextLine();
        // calling use defined split method
        String[][] splited1 = splitString(s);

        System.out.println("word------Length");
        for (int i = 0; i < splited1.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("%-10s", splited1[i][j]);

            }
            System.out.println();

        }
    }
}

