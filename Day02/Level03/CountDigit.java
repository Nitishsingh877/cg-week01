import java.util.Scanner;

public class CountDigit  {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask the user input a  = variables named number 
        System.out.print("Enter a   number: ");
        int number = input.nextInt();
	int count = 0;
		

	while(number !=0){
	number = number/10;
	count++;	
}
	            System.out.println(count);
        
	
	// Close the scanner
        input.close();
    }
}