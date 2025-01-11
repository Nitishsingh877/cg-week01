import java.util.Scanner;
	
public class checkNaturalSumRecursive{

	public static int sumOfnumbers(int number) {
		if(number == 0){
			return 0;
}
		return number + sumOfnumbers(number - 1);
	   }
	public static int checkSum(int number) {
		return  ((number*(number+1))/2);
}
	 public static void main(String[] args) {

        // Create a input object for input
        Scanner input = new Scanner(System.in);

        // Taking user input  number
	
        System.out.print("Enter the number :  ");
        int number  = input.nextInt();
	
	int recursiveres = sumOfnumbers(number);
	int formulaeres =  checkSum(number);

	System.out.println("recursive result is : " + recursiveres);
	System.out.println("formulae result is : " + formulaeres);
	

	
	
	// Close the scanner
        input.close();
    }
}