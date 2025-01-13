import java.util.Scanner;

public class 	BMIcalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

  // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();

        
 // Create arrays to store height, weight, BMI, and weight status
        double[] heights = new double[numPersons];
        double[] weights = new double[numPersons];
        double[] bmiValues = new double[numPersons];
        String[] weightStatuses = new String[numPersons];


 // Take input for height and weight of each person
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Height (in meters): ");
            heights[i] = input.nextDouble();
            System.out.print("Weight (in kilograms): ");
            weights[i] = input.nextDouble();
        }


// Calculate BMI and determine weight status
        for (int i = 0; i < numPersons; i++) {
            bmiValues[i] = weights[i] / (heights[i] * heights[i]); // BMI formula


 // Determine weight status
            if (bmiValues[i] < 18.5) {
                weightStatuses[i] = "Underweight";
            } else if (bmiValues[i] < 24.9) {
                weightStatuses[i] = "Normal weight";
            } else if (bmiValues[i] < 29.9) {
                weightStatuses[i] = "Overweight";
            } else {
                weightStatuses[i] = "Obese";
            }
        }

 // Display results
        System.out.printf("%-10s %-10s %-10s %-20s%n", "Height", "Weight", "BMI", "Weight Status");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-20s%n", heights[i], weights[i], bmiValues[i], weightStatuses[i]);
        }

       input.close();
    }
}