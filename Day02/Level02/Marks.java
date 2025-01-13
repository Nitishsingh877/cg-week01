import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a marks
        System.out.print("Enter your Physics marks: ");
        int phyMarks = input.nextInt();
	System.out.print("Enter your Chemistry marks: ");
        int chemMarks = input.nextInt();
	System.out.print("Enter your Maths marks: ");
        int mathsMarks = input.nextInt();

        double avMarks = (phyMarks+chemMarks+mathsMarks)/3;

		if(avMarks>=80){
		System.out.println("Aveagre Mark is" + avMarks + "grade is Level 4, above agency-normalized standards");	
		}
		else if(avMarks<=79 && avMarks>=70){
		System.out.println("Aveagre Mark is" + avMarks + "grade is Level 3, at agency-normalized standards");	
		}
		else if(avMarks<=69 && avMarks>=60){
		System.out.println("Aveagre Mark is" + avMarks + "grade is Level 2, but apporaching agency-normalized standards");	
		}	
		else if(avMarks<=59 && avMarks>=50){
		System.out.println("Aveagre Mark is" + avMarks + "grade is Level 1, well below  agency-normalized standards");	
		}
		else if(avMarks<=49 && avMarks>=40){
		System.out.println("Aveagre Mark is" + avMarks + "grade is Level 1, too below  agency-normalized standards");	
		}
		else {
		System.out.println("remedial standards");
}

        // Close the scanner
        input.close();
    }
}