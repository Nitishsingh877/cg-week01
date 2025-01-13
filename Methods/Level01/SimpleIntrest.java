import java.util.Scanner;

public class SimpleIntrest {

 // Method to calculate the Simple Interest = Principal * Rate * Time / 100
//Take user input for principal, rate, time

     	public static double calculateSI(double principal, double rate, double time) {
        return (principal*rate*time)/100;
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking user input for user input for principal, rate, time


        System.out.print("Enter the principal: ");
        double principal = input.nextDouble();
        System.out.print("Enter the rate : ");
        double rate = input.nextDouble();	
	System.out.print("Enter the time : ");
        double time = input.nextDouble();



        // Calling methods to calculate sum and difference
        double Si = calculateSI(principal, rate, time);
      

        // Displaying the results
        System.out.println("The Simple Interest is "  + Si+ " for Principal " +principal+ " , Rate of Interest " + rate + " and Time "+ time); 


	input.close();
    }
}

