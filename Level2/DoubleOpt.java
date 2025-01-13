import java.util.Scanner;

public class DoubleOpt   {
	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input for a,b,c

        System.out.print("Enter the a :  ");
        double a = input.nextDouble();
		
	System.out.print("Enter the b :  ");
        double b = input.nextDouble();
	
	System.out.print("Enter the c :  ");
        double c = input.nextDouble();
	
        // Performing  operations

	double opPM =  a + b *c;
	double opMP =  a * b + c;
	double opPD =  c + a / b;
	double opMOP =  a % b + c;
	

        // Printing the results

        System.out.println(" The results of Int Operations are " + opPM + "," + opMP  + "," + opPD + "," + opMOP);
        
        // Close the scanner
        input.close();
    }
}