import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask the user input a  = variables named number 
        System.out.print("Enter a   number: ");
        int number = input.nextInt();
	

	for(int i=1; i<number; i++){
		if(number%i == 0){
	System.out.println(i);	     
}
}
	// Close the scanner
        input.close();
    }
}