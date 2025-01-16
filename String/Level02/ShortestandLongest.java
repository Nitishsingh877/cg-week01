import java.util.Scanner;

public class ShortestandLongest {
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
    public static String[] shortestAndLongest(String[][] arr){
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        String shorti = "";
        String longi = "";
        for (int i = 0; i < arr.length; i++) {
            mini = Math.min(mini, Integer.parseInt(arr[i][1]));
            maxi = Math.max(maxi, Integer.parseInt(arr[i][1]));

        }
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i][1].equals(String.valueOf(mini)))
                shorti+=arr[i][0];
            if(arr[i][1].equals(String.valueOf(maxi)))
                longi +=arr[i][0];

        }
        return new String[]{shorti,longi};
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = sc.nextLine();
        // calling use defined split method
        String[][] splited1 = splitString(s);
        String[] parsed = shortestAndLongest(splited1);
        System.out.println("The shortest word is:"+parsed[0]);
        System.out.println("The longest word is: "+parsed[1]);
    }
}
