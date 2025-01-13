import java.util.*;

public class ConvertHeight {
	
 	public static void main(String[] args) {

//declearing variables for height
		double height;
	
//code for input.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Height in cms");
		height = input.nextDouble();

//converting into feet and inches
// 1 foot = 12 inches and 1 inch = 2.54 cm
		double inches = height/2.54;
		double  feet = inches/12;
		
//output
 
		
     		
     		System.out.println("Your Height in cm is " + (String.format("%.2f",height)) + " while in feet is "+ (String.format("%.2f",feet)) +"and inches is " + (String.format("%.2f",inches)));

     }
}