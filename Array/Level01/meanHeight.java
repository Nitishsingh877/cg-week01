import java.util.Scanner;

public class meanHeight  {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
//define an array
       double[] height =  new double[11]; 
       double sum = 0.0;  
//take input
	for(int i=0;i<height.length; i++){
	System.out.println("Enter the numbers " +(i+1) + ":");
	height[i] = input.nextDouble();
	}

//loop thriugh array
	for(int i=0;i<height.length; i++){
			sum += height[i];	
		}
		double meanHeight = sum/11;

		System.out.println("The mean height is " + meanHeight);
	
	// Close the scanner
        input.close();
    }
}