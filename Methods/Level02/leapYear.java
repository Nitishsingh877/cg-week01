import java.util.Scanner;

public class leapYear {

		public static void checkLeapYear(int year) {
		
		if(year>=1582){
		if(year%4 == 0 && year%400 == 0){
		System.out.println(year +"is a Leap year");
		}
		else {
		System.out.println(year + "is not a leap year");
}

	}

	else {
		System.out.println(year + "is not valid in gregorian calendar");

}
}


    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

	
// calling method
		checkLeapYear(year);
        
        // Close the scanner
        input.close();
    
}
}