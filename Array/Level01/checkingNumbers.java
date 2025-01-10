import java.util.Scanner;

public class checkingNumbers  {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
//define an array
       int[] numbers =  new int[5];   
//take input
	for(int i=0;i<numbers.length; i++){
	System.out.println("Enter the numbers " +(i+1) + ":");
	numbers[i] = input.nextInt();
	}

//loop thriugh array
	System.out.println("\nchecking type of numbers");
	for(int i=0;i<numbers.length; i++){
		 if (numbers[i] > 0) {
                System.out.println("Positive number ");
            }
		 else if (numbers[i] < 0) {
                System.out.println("Negative");
            } 
		else {
                System.out.println("Zero");
            }
}
		
		for(int i=0;i<numbers.length; i++){
		if(numbers[0]>numbers[4]){
			System.out.println("greater");
			break;
}
        	
		else if(numbers[0]<numbers[4]){
			System.out.println("smaller");
			break;
}
        
		else{
			System.out.println("Equal");
			break;
}
        }

	
	// Close the scanner
        input.close();
    }
}