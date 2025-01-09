import java.util.Scanner;

public class TotalIncome   {
	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input  variable named salary
	//variable bonus and take user input

        System.out.print("Enter the salary  :  ");
        double salary   = input.nextDouble();
	
	System.out.print("Enter the bonus  :  ");
        double bonus   = input.nextDouble();
		
	
	
        // Performing  operations
		
 	double income =salary+bonus;

        // Printing the results

        System.out.println("The salary is INR " + salary+ " and bonus is INR  " + bonus +"  Hence Total Income is INR "+income );


        // Close the scanner
        input.close();
    }
}