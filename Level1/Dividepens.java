import java.util.*;

public class Dividepens {
	
 	public static void main(String[] args) {
		
     		int pens = 14;
     		int students = 3;
                
		int quantityOfPens = pens/students;
		int remainingPens = pens % students;

     		System.out.println("The Pen Per Student is " +quantityOfPens + " and the remaining pen not distributed is "+ remainingPens);
     }
}