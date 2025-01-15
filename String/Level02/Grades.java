import  java.util.Scanner;
public class Grades {
    public static int[][] randomScores(int size){
        int[][] marks = new int[size][3];

//        0 -> Physics
        // 1-> Chemistry
        // 2 -> Math
        for (int i = 0; i < size; i++) {
            int p = (int)(Math.random()*100);
            int c = (int)(Math.random()*100);
            int m = (int)(Math.random()*100);
            marks[i][0] = p;
            marks[i][1] = c;
            marks[i][2] = m;
        }
        return marks;
    }
    public static double[][] calculate(int[][] arr){
        double[][] calc = new double[arr.length][3];
        // 0 -> total
        // 1 -> average
        // 2 -> percentage
        for(int i =0;i< arr.length;i++){
            int total = arr[i][0] + arr[i][1] +arr[i][2];
            double avg = Math.round(((double)total/3)*100.0)/100.0;
            double perc = avg;
            calc[i][0] = (double) total;
            calc[i][1] = avg;
            calc[i][2] = perc;
        }
        return calc;
    }
    public static char grade(double perc){
        if(perc > 80.0)
            return 'A';
        else if (perc >= 70.0 && perc < 80.0) {
            return 'B';
        } else if (perc >= 60.0 && perc < 70.0) {
            return 'C';
        } else if (perc >= 50.0 && perc < 60.0) {
            return 'D';
        } else if (perc >= 40 && perc < 50.0) {
            return 'E';
        }
        return 'R';

    }
    public static void displayScorecard(int[][] scores, double[][] calculations) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s%n",
                "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Grade");
        System.out.println("======================================================================");

        for (int i = 0; i < scores.length; i++) {
            char grade = grade(calculations[i][2]);
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10.2f %-10c%n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2],
                    calculations[i][0], calculations[i][1], grade);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Generate random scores for students
        int[][] scores = randomScores(n);

        // Calculate total, average, and percentage for each student
        double[][] calculations = calculate(scores);

        // Display the scorecard
        displayScorecard(scores, calculations);

    }
}

