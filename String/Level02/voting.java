import java.util.Scanner;

public class voting {
    public static int[] ageStudents(int size){
        int[] ages = new int[size];
        for (int i = 0; i < size; i++) {
            int age = (int)(Math.random() * 90) +10;
            ages[i] = age;

        }
        return ages;

    }
    public static String[][] canVote(int[] ages){
        String[][] answer = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {

            if(ages[i] > 18){
                answer[i][0] = String.valueOf(ages[i]);
                answer[i][1] = "True";
            }
            else{
                answer[i][0] = String.valueOf(ages[i]);
                answer[i][1] = "False";
            }
        }
        return answer;
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students");
        int size = sc.nextInt();
        int[] ages = ageStudents(size);
        String[][] canVote = canVote(ages);
        System.out.println("Age------canVote");
        for(int i = 0;i<canVote.length;i++){
            for (int j = 0; j < 2; j++) {
                System.out.printf("%-10s",canVote[i][j]);
            }
            System.out.println();
        }
    }
}
