import java.util.Scanner;

public class srudentsRemarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

  // Take input for the number of persons
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        
 // Create arrays to store marks, percentage, grades
	int[] physicsMarks = new int[numStudents];
        int[] chemistryMarks = new int[numStudents];
        int[] mathsMarks = new int[numStudents];
        double[] percentages = new double[numStudents];
        String[] grades  = new String[numStudents];

// Take input for marks in Physics, Chemistry, and Maths for each student
        
	    for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1));

// Input for Physics marks
            int physics;
            do {
                System.out.print("Physics marks (0-100): ");
                physics = input.nextInt();
                if (physics < 0 || physics > 100) {
                    System.out.println("Marks must be between 0 and 100. Please enter again.");
                }
            } while (physics < 0 || physics > 100);
            physicsMarks[i] = physics;

 // Input for Chemistry marks
            int chemistry;
            do {
                System.out.print("Chemistry marks (0-100): ");
                chemistry = input.nextInt();
                if (chemistry < 0 || chemistry > 100) {
                    System.out.println("Marks must be between 0 and 100. Please enter again.");
                }
            } while (chemistry < 0 || chemistry > 100);
            chemistryMarks[i] = chemistry;

 // Input for Maths marks
            int maths;
            do {
                System.out.print("Maths marks (0-100): ");
                maths = input.nextInt();
                if (maths < 0 || maths > 100) {
                    System.out.println("Marks must be between 0 and 100. Please enter again.");
                }
            } while (maths < 0 || maths > 100);
            mathsMarks[i] = maths;


 // Calculate the percentage for the student
            double totalMarks = physics + chemistry + maths;
            percentages[i] = (totalMarks / 300) * 100;

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
         System.out.printf("%-15s %-15s %-15s %-15s  %-15s%n", "physicsMarks", "chemistryMarks" ,"mathsMarks", "percentage", "grades");
        System.out.println("-------------------------------------------------------------------");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-15d %-15d %-15d %-15.2f %-15s%n", physicsMarks[i],chemistryMarks[i],mathsMarks[i], percentages[i], grades[i]);
        }



       input.close();
    }
}