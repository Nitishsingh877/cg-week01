import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take salary and year of service in the year as input

	System.out.println("Enter the  salary: ");
	double salary = input.nextDouble();
	System.out.println("Enter the   year of service: ");
	double  yearOfService = input.nextDouble();
	
	

	// taking for test
	if(yearOfService>5){
		double bonus = salary*0.05;
		System.out.println("bonus is "+ bonus);
}
	else {
	System.out.println("not avilable for bonus");
}
	// Close the scanner
        input.close();
    }
}