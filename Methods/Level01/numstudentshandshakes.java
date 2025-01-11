import java.util.Scanner;

public class numstudentshandshakes {

 
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking user input for user input for principal, rate, time


        System.out.print("Enter the number of students: ");
        double numstudents = input.nextDouble();
        


        // Calling methods to calculate sum and difference
        double numberOfHandshakes = (numstudents*(numstudents-1))/2;
      

        // Displaying the results
        System.out.println("The possible handshakes are"+ numberOfHandshakes); 


	input.close();
    }
}