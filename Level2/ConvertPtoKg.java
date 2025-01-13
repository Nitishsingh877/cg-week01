import java.util.Scanner;

public class ConvertPtoKg    {
	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input  weight
	
        System.out.print("Enter the weight :  ");
        double weight   = input.nextDouble();
	
        // Performing  operations
	// 1 pound = 2.2 kg
	double weightinPound =  weight/2.2;
		

        // Printing the results

        System.out.println(" The weight of the person in pound is"+(String.format("%.2f" ,weightinPound)) +" and in kg is " +weight );  

 // Close the scanner
        input.close();
    }
}