import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for the starting value of the countdown

        System.out.print("Enter the starting number for the countdown: ");
        int counter = input.nextInt();

        // Countdown using a for loop
        System.out.println("Starting countdown:");
        for(int count = counter; count>=1; count--) {
            System.out.println(count);
        }

       
        // Close the scanner
        input.close();
    }
}