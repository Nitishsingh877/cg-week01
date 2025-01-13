import java.util.Scanner;

public class srudentsRemarks2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

  // Take input for the number of persons
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        
 // Create arrays to store marks, percentage, grades
	int[][] marks = new int[numStudents][3];
// Rows: students, Columns: subjects
        double[] percentages = new double[numStudents];
        String[] grades  = new String[numStudents];


  // Input marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + " (Physics, Chemistry, Maths): ");
            for (int j = 0; j < 3; j++) {
                int mark;
                do {
                    mark = input.nextInt();
                    if (mark < 0) {
                        System.out.println("Marks cannot be negative. Please enter a positive value.");
                    }
                } while (mark < 0);
                marks[i][j] = mark;
            }
        }

 // Calculate percentages and grades for each student
       		    for (int i = 0; i < numStudents; i++) {
        	    int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
         	    percentages[i] = totalMarks / 3.0;
// Calculate the grade based on the percentage
            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }


 // Display the marks, percentages, and grades of each student
         System.out.printf("%-15s %-15s %-15s %-15s  %-15s%n", "Physics","chemistry","maths", "percentage", "grades");
        System.out.println("-------------------------------------------------------------------");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-15d %-15d %-15d %-15.2f %-15s%n", marks[i][0],marks[i][1],marks[i][2], percentages[i], grades[i]);
        }



       input.close();
    }
}