import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a marks
        System.out.print("Enter your number : ");
        int number = input.nextInt();
	boolean isPrime = true;

	if(number>1){
	for(int i=2;i<=Math.sqrt(number);i++){
	if(number%i == 0){
		isPrime = false;
		break;
	}
}
}	
	if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }	
	
	// Close the scanner
        input.close();
    }
}