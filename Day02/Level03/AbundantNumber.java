import java.util.Scanner;

public class AbundantNumber  {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask the user input a  = variables named number 
        System.out.print("Enter a   number: ");
        int number = input.nextInt();
	int sum = 0;
	

	for(int i=1; i<number; i++){
		if(number%i == 0){
		sum += i;
}
}
    //System.out.println(sum);
 	if(sum>number){
	System.out.println("Abundant numar");
  }	else {
	System.out.println("Not abudant number");
	}
        
	
	// Close the scanner
        input.close();
    }
}