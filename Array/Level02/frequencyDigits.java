import java.util.Scanner;

public class frequencyDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

  // Take input for the number 
        System.out.print("Enter the number : ");
        int number = input.nextInt();

 // Handle negative numbers
        number = Math.abs(number);

 // step 1 :Create count
	
 	int count = 0;
	int temp = number;
	    while(temp>0){
			temp /= 10;
			count++;
}



// create an array to store digit
	int[] digits = new int[count];

//save single digit
	for(int i=count -1; i>=0; i--){
	digits[i] = number%10;
	number /= 10;
}

// Array to store the frequency of each digit
        int[] frequency = new int[10];

//find and store digit frequency
	 for (int digit : digits) {
            frequency[digit]++;
        }
// Step 4: Display the frequency of each digit
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
       input.close();
    }
}