import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask the user input a  two variables named number and power. 
        System.out.print("Enter a   number: ");
        int number = input.nextInt();
	
        System.out.print("Enter power: ");
        int power = input.nextInt(); 	


	int result = 1;

	for(int i=1; i<=power; i++){
		result = result*number;	     
}
	System.out.println(result);


	// Close the scanner
        input.close();
    }
}
