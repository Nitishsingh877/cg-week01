
import java.util.Scanner;

public class  CheckNumber {


	public static void number(double n){
	    
	if(n > 0) {
		System.out.println("1");
	}
	else if(n<0){	
		System.out.println("-1");	
	}
	else {
		System.out.println("0");
	}

	}


	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input number
	
        System.out.print("Enter the number :  ");
        double n  = input.nextDouble();
	
		
        // call the methods
	
	number(n);

 	
        // Close the scanner
        input.close();
    }
}

