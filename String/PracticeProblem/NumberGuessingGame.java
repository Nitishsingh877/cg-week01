import java.util.*;
import java.util.Random;
public class NumberGuessingGame {
// Function to generate a random guess within a given range
public static int generateGuess(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min; // Generates a random number between min and max
        }
// Function to get feedback from the user
public static String getUserFeedback() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is the guess too high, too low, or correct?");
        return scanner.nextLine().toLowerCase(); // Return the feedback in lowercase
        }
// Main game loop function
public static void playGame() {
        int min = 1;
        int max = 100;
        int guess = 0;
        String feedback = "";

        System.out.println("Think of a number between 1 and 100, and I'll try to guess it.");

        // Loop until the guess is correct
        while (!feedback.equals("correct")) {
        guess = generateGuess(min, max); // Generate a guess within the current range
        System.out.println("My guess is: " + guess);
        feedback = getUserFeedback(); // Get user feedback

        // Adjust range based on user feedback
        if (feedback.equals("high")) {
        max = guess - 1;
        } else if (feedback.equals("low")) {
        min = guess + 1;
        } else if (feedback.equals("correct")) {
        System.out.println("Yay! I guessed your number: " + guess);
        } else {
        System.out.println("Invalid input! Please enter 'high', 'low', or 'correct'.");
        }
        }
        }

    public static void main(String[] args) {
        playGame();
    }
}