import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask the user input a number 
        System.out.print("Enter a   number: ");
        int number = input.nextInt();
	
	int greatestFactor = 1;

	for(int i=number-1; i>=1; i--){
	     if(number%i == 0){
	      greatestFactor = i;
	      break;
}
}

	System.out.println(greatestFactor);
        // Close the scanner
        input.close();
    }
}
