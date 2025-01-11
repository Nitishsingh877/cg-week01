import java.util.Arrays;

public class RandomValueStats {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000; // Generates random numbers between 1000 and 9999
        }
        return randomNumbers;
    }

    // Method to find the average, minimum, and maximum values of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        // Generate an array of 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Find the average, minimum, and maximum values
        double[] stats = findAverageMinMax(randomNumbers);

        // Display the results
        System.out.println("Generated Random Numbers: " + Arrays.toString(randomNumbers));
        System.out.printf("Average: %.2f%n", stats[0]);
        System.out.printf("Minimum: %.0f%n", stats[1]);
        System.out.printf("Maximum: %.0f%n", stats[2]);
    }
}
