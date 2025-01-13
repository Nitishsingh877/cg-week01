import java.util.*;

public class CalculatePnL {
	
 	public static void main(String[] args) {
		
     		int costPrice = 124;
     		int sellingPrice = 191;
     		


     		int profit = (sellingPrice-costPrice);
		double profitPercentage = ((double)profit/costPrice)*100.0;

     		System.out.println("The Cost Price is INR " + costPrice  +"  and Selling Price is INR "+ sellingPrice);
		System.out.println("The Profit is INR "+ profit + " and the Profit Percentage is "+ profitPercentage);
     }
}