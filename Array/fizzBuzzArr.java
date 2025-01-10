import java.util.Scanner;

public class fizzBuzzArr  {
    public static void main(String[] args) {
// Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        System.out.println("enter your number");
	int number = input.nextInt();

    	if(number <=0){
	System.out.println("invalid number");
	System.exit(0);
	}
	
// Create a String array to store the results
        String[] results = new String[number + 1];
	

	       
//take operations
	for(int i=0;i<=number; i++){
	     if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }
// Loop to display the results
        	for (int i = 0; i <= number; i++) {
          	  System.out.println("Position " + i + " = " + results[i]);
        }
// Close the scanner
        input.close();
    }
}