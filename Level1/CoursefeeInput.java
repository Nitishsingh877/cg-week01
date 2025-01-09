import java.util.*;

public class s {
	
 	public static void main(String[] args) {

//declearing variables for fee and discounts
		int fee,discountPercent;
	
//code for input.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your school fee");
		fee = input.nextInt();
		System.out.println("Enter your school Discount");
		discountPercent = input.nextInt();
//discounted amounts and price
		int discount = fee/discountPercent;
		int discountedAmount = discount;
 		int discountedPrice = fee-discount;
//output
 
		
     		
     		System.out.println("The discount amount is INR " +discountedAmount + "and final discounted fee is INR "+ discountedPrice
);
     }
}