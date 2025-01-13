import java.util.Scanner;

public class  CheckAge {
	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input  age
	
        System.out.print("Enter the age :  ");
        double age  = input.nextDouble();
	
		
        // Performing  operations
	
	if(age >= 18) {
		System.out.println("The person's age is " + age +" and can vote.");
	}
	else {	
		System.out.println("The person's age is " + age +" and cannot vote.");	
	}
        // Close the scanner
        input.close();
    }
}