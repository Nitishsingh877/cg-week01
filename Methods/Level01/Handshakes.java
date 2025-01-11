import java.util.Scanner;

public class Handshakes {

 // Method to calculate find the maximum number of handshakes among N number of students.

     		public static double handShakes(double numstudents) {
        return (numstudents*(numstudents-1))/2;
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking user input for user input for principal, rate, time


        System.out.print("Enter the number of students: ");
        double numstudents = input.nextDouble();
        


        // Calling methods to calculate sum and difference
        double numberOfHandshakes = handShakes(numstudents);
      

        // Displaying the results
        System.out.println("The possible handshakes are"+ numberOfHandshakes); 


	input.close();
    }
}

