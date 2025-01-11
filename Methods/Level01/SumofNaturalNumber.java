import java.util.Scanner;

public class  SumofNaturalNumber {

	public static void sum(double number) {

	double sumOfNaturalNumber = (number*(number+1))/2;

	if(number > 0) {
		System.out.println("The sum of "+ number +" natural numbers is "+ sumOfNaturalNumber);
	}
	else {	
		System.out.println("The number "+number+"is not a natural number");	
	}

}
	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input  number
	
        System.out.print("Enter the number :  ");
        double number  = input.nextDouble();
	
		
        // calling methods for sum
	
	sum(number);


	// Close the scanner
        input.close();
    }
}

