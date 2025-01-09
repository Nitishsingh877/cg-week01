import java.util.Scanner;

public class  CheckNumber {
	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input number
	
        System.out.print("Enter the number :  ");
        double number  = input.nextDouble();
	
		
        // Performing  operations
	
	if(number > 0) {
		System.out.println("Positive!");
	}
	else if(number<0){	
		System.out.println("negative!");	
	}
	else {
		System.out.println("Zero!");
	}
        // Close the scanner
        input.close();
    }
}