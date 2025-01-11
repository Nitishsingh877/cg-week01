import java.util.Scanner;
	
public class Factorcal{

	public static double[] findFactors(double number) {
	   // First, count the factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
}
//initialise factor with count size 
		double[] factors = new double[count];
		int index = 0;

   // Find and store factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
}
		return factors;
}	
	 // Method to find the sum of factors
    public static double sumOfFactors(double[] factors) {
        int sum = 0;
        for (double factor : factors) {
            sum += factor;
        }
        return sum;
    }
	// Method to find the product of factors
    public static long productOfFactors(double[] factors) {
        long product = 1;
        for (double factor : factors) {
            product *= factor;
        }
        return product;
    }

	 // Method to find the sum of squares of factors
    public static double sumOfSquaresOfFactors(double[] factors) {
        double sumOfSquares = 0;
        for (double factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }


	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input  number
	
        System.out.print("Enter the number :  ");
        double number  = input.nextDouble();

	// Find factors
        double[] factors = findFactors(number);

        // Calculate results
        double sum = sumOfFactors(factors);
        long product = productOfFactors(factors);
        double sumOfSquares = sumOfSquaresOfFactors(factors);
	

	// Display the results
        System.out.println("Factors of " + number + ":");
        for (double factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);


	// Close the scanner
        input.close();
    }
}