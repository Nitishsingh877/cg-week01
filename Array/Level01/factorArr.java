import java.util.Scanner;

public class factorArr  {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        System.out.println("enter your number");
	int number = input.nextInt();

    	if(number <=0){
	System.out.println("invalid number");
	System.exit(0);
	}
	int maxFactor = 10;
//define an array
	int[] factors = new int[maxFactor];
	int index = 0;

	       
//take input
	for(int i=1;i<=number; i++){
		if(number%i == 0){
		//add factor to array
		if(index == maxFactor){
		maxFactor = 2*maxFactor;

		int[] temp = new int[maxFactor];
//System.arraycopy is a built-in method in Java used to copy elements from one array to another efficiently.
//System.arraycopy(sourceArray, sourcePosition, destinationArray, destinationPosition, length);
		System.arraycopy(factors, 0, temp, 0, factors.length);
                factors = temp; 
}
		factors[index] = i;
		index++;	
	}
		}
//display factors

		 System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }


	// Close the scanner
        input.close();
    }
}