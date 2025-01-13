import java.util.Scanner;

public class numRounds {

    public static double rounds(double perimeter) {
        return perimeter/5;
    }


 
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking user input for user input triangle sides

        System.out.print("Enter the number of side1: ");
        double side1 = input.nextDouble();
	System.out.print("Enter the number of side2: ");
        double side2 = input.nextDouble();
	System.out.print("Enter the number of side3: ");
        double side3  = input.nextDouble();

  	double perimeter = side1+side2+side3;
        


        // Calling methods to calculate sum and difference
        double numberOfRounds = rounds(perimeter);
      

        // Displaying the results
        System.out.println("The possible rounds are"+ numberOfRounds); 


	input.close();
    }
}