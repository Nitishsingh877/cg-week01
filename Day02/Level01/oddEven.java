import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for the starting value of the Factorial

	System.out.println("Enter the  number: ");
	double number = input.nextDouble();
	

	// taking for loop
	for(int i=1;i<=number; i++){
	if(i%2==0){
	System.out.println("Even");
}	else {
	System.out.println("Odd");
}
	
}
        // Close the scanner
        input.close();
    }
}