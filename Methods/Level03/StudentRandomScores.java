import java.util.Random;
import java.util.Scanner;

public class StudentRandomScores {
    public static int[][] generateRandomScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Maths
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(101); // Physics (0-100)
            scores[i][1] = rand.nextInt(101); // Chemistry (0-100)
            scores[i][2] = rand.nextInt(101); // Maths (0-100)
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3]; // 3 columns: Total, Average, Percentage
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = (double) total / 3;
            double percentage = (double) total / 300 * 100;
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Round average to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Round percentage to 2 decimal places
        }
        return results;
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println();
        System.out.println("Student\tPhysics\tChemistry\tMaths\t\tTotal\tAverage\tPercentage");
        System.out.println();
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t\t%d\t\t%d\t\t%.0f\t\t%.2f\t\t%.2f%%\n", i + 1, scores[i][0], scores[i][1],
                    scores[i][2],
                    results[i][0], results[i][1], results[i][2]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
	
		//create instance of scanner class
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Students numbers: ");
        int numStudents = input.nextInt();
        int[][] studentScores = generateRandomScores(numStudents);
        double[][] studentResults = calculateResults(studentScores);
        displayScorecard(studentScores, studentResults);
		
		//close Scanner
        input.close();
    }
}