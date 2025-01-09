import java.util.Scanner;

public class  smallest {
	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input  number1, number2, number3
	
        System.out.print("Enter the number1 :  ");
        double number1   = input.nextDouble();
	
	System.out.print("Enter the number2 :  ");
        double number2   = input.nextDouble();
	
	System.out.print("Enter the number3 :  ");
        double number3   = input.nextDouble();
	
	
        // Performing  operations
	if(number1<number2 && number1<number3){
 		System.out.println(" Is the first number the smallest?"+" yes!");
}		
	else {
		System.out.println(" Is the first number the smallest?" +" NO!");
}
        // Close the scanner
        input.close();
    }
}