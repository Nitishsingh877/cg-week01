
import java.util.Scanner;

public class YoungestAndTallestFriend {

	
    // Method to find the youngest friend's index

    public static int findYoungest(int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
	 // Method to find the tallest friend's index

    public static int findTallest(double[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
	String[] names = {"Amar", "Akbar", "Anthony"};
	double[] heights = new double[3];
	int[] ages    = new int[3];

	  // Take user input for age and height
        System.out.println("Enter the age and height (in meters) for Amar, Akbar, and Anthony:");

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age for " + names[i] + ": ");
            ages[i] = input.nextInt();
            System.out.print("Enter height for " + names[i] + ": ");
            heights[i] = input.nextDouble();
        }


	// Find the youngest and tallest
        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);

        // Display the results
        System.out.println("\nResults:");
        System.out.println("The youngest is " + names[youngestIndex] + " with age " + ages[youngestIndex] + " years.");
        System.out.println("The tallest is " + names[tallestIndex] + " with height " + heights[tallestIndex] + " meters.");

        // Close the scanner
        input.close();
    }
}

