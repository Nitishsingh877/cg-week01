import java.util.Scanner;

public class oddEvenArr  {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        System.out.println("enter your number");
	int number = input.nextInt();
    	if(number <=0){
	System.out.println("invalid number");
	System.exit(0);
	}

//define an array
       int[] evenarr =  new int[(number/2) +1];
       int[] oddarr =   new int[(number/2) +1]; 
//index variables
	int evenindex = 0;
	int oddindex = 0;        
//take input
	for(int i=0;i<number; i++){
		if(i%2 == 0){
		evenarr[evenindex] = i;
		evenindex++; 	
	} else {
		oddarr[oddindex] = i;
		oddindex++;
		}
	}	

	 // Print the odd numbers array
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddindex; i++) {
            System.out.print(oddarr[i] + " ");
        }

        System.out.println();

        // Print the even numbers array
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenindex; i++) {
            System.out.print(evenarr[i] + " ");
        }
	// Close the scanner
        input.close();
    }
}