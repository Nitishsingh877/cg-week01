import java.util.*;

public class Convertkmtom{
	
 	public static void main(String[] args) {

//creating variables KM
		double km;
		

//code for input
		Scanner input = new Scanner(System.in);
     		System.out.println("enter kilometres");
                km = input.nextDouble();
		double miles = km*1.6;

		
//output

     		System.out.println(" The total miles is " + miles +" mile for the given"+ km + "km.");
     }
}