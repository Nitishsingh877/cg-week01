import java.util.Scanner;

public class IntOperation  {
	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input for a,b,c

        System.out.print("Enter the a :  ");
        int a = input.nextInt();
		
	System.out.print("Enter the b :  ");
        int b = input.nextInt();
	
	System.out.print("Enter the c :  ");
        int c = input.nextInt();
	
        // Performing  operations

	int opPM =  a + b *c;
	int opMP =  a * b + c;
	int opPD =  c + a / b;
	int opMOP =  a % b + c;
	

        // Printing the results

        System.out.println(" The results of Int Operations are " + opPM + "," + opMP  + "," + opPD + "," + opMOP);
        
        // Close the scanner
        input.close();
    }
}