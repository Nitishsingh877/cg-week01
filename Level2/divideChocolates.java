import java.util.Scanner;

public class  divideChocolates  {
	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input  numberOfchocolates,numberOfChildren
	

        System.out.print("Enter the number Of chocolates  :  ");
        int numberOfchocolates   = input.nextInt();
	
	System.out.print("Enter the number Of Children  :  ");
        int numberOfChildren   = input.nextInt();

	
        // Performing  operations
	int	numberOfChoclategotEach = numberOfchocolates/numberOfChildren;
	int	remainingChocolates = numberOfchocolates%numberOfChildren;
		

        // Printing the results

        System.out.println("The number of chocolates each child gets is " + numberOfChoclategotEach + "and the number of remaining chocolates are " + remainingChocolates);  

 // Close the scanner
        input.close();
    }
}