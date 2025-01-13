import java.util.Scanner;
import java.util.Random;

public class FootballTeamHeights {

	 // Method to generate random heights for players
   
	 public static int[] generateRandomHeights(int size, int min, int max) {
        Random random = new Random();
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = random.nextInt(max - min + 1) + min;
        }
        return heights;
    }
	 // Method to calculate the sum of all elements in the array
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
	 // Method to calculate the mean height of the players
    public static double calculateMean(int[] array) {
        int sum = calculateSum(array);
        return (double) sum / array.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] array) {
        int shortest = array[0];
        for (int num : array) {
            if (num < shortest) {
                shortest = num;
            }
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallest(int[] array) {
        int tallest = array[0];
        for (int num : array) {
            if (num > tallest) {
                tallest = num;
            }
        }
        return tallest;
    }




    public static void main(String[] args) {
       int[] heights = generateRandomHeights(11, 150, 250);

        int sum = calculateSum(heights);
        double mean = calculateMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Player Heights (in cms):");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println("\n\nResults:");
        System.out.println("Sum of Heights: " + sum + " cms");
        System.out.println("Mean Height: " + String.format("%.2f", mean) + " cms");
        System.out.println("Shortest Height: " + shortest + " cms");
        System.out.println("Tallest Height: " + tallest + " cms");
    }
    }

