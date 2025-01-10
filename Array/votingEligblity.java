import java.util.Scanner;

public class votingEligblity  {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
//define an array
       int[] ages =  new int[10];   
//take input
	System.out.println("enter the afe of 10 students");
	for(int i=0;i<ages.length; i++){
	System.out.println("Enter the age for students " +(i+1) + ":");
	ages[i] = input.nextInt();
	}

//loop thriugh array
	System.out.println("\nVoting ellligblity status");
	for(int i=0;i<ages.length; i++){
		 if (ages[i] < 0) {
                System.out.println("Invalid age: " + ages[i]);
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }
	
	// Close the scanner
        input.close();
    }
}