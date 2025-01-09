import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for the starting value of the countdown

        System.out.print("Enter the starting number for the countdown: ");
        int counter = input.nextInt();

        // Countdown using a while loop
        System.out.println("Starting countdown:");
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrement the counter
        }

       
        // Close the scanner
        input.close();
    }
}