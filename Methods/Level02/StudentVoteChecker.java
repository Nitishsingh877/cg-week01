import java.util.Scanner;
	
public class StudentVoteChecker{

	 // Method to check if a student can vote
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            System.out.println("Invalid age. Age cannot be negative.");
            return false;
        }
        return age >= 18;
    }
	
	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);

        // Array to store the ages of 10 students
        int[] studentAges = new int[10];

        System.out.println("Enter the ages of 10 students:");

        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = input.nextInt();

	 // Call the canStudentVote method

            boolean canVote = canStudentVote(studentAges[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " is not eligible to vote.");
            }
        }




	input.close();
       	    }
}