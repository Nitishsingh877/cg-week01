import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a marks
        System.out.print("Enter your number : ");
        int number = input.nextInt();
	
	if(number>=0){
	for(int i=0;i<=number;i++){	
	if(i%3==0 && i%5==0){
	System.out.println("FizzBuzz");
}	
	if(i%5==0){
	System.out.println("Buzz");
}	else if(i%3==0) {
	System.out.println("Fizz");
}	
	else {
System.out.println(i);
}
	} 
}
	
	// Close the scanner
        input.close();
    }
}