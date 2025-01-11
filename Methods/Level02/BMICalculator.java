import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI for all members and store it in the 2D array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightInMeters = data[i][1] / 100; // Convert height from cm to meters
            data[i][2] = data[i][0] / (heightInMeters * heightInMeters); // BMI formula
        }
    }

    // Method to determine the BMI status of all members
    public static String[] determineBMIStatus(double[][] data) {
        String[] bmiStatuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                bmiStatuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                bmiStatuses[i] = "Normal weight";
            } else if (bmi >= 25 && bmi <= 29.9) {
                bmiStatuses[i] = "Overweight";
            } else {
                bmiStatuses[i] = "Obese";
            }
        }
        return bmiStatuses;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int numMembers = 10;

        // 2D array to store weight, height, and BMI for 10 members
        double[][] teamData = new double[numMembers][3];

        // Input weight and height for each member
        System.out.println("Enter weight (in kg) and height (in cm) for each team member:");
        for (int i = 0; i < numMembers; i++) {
            System.out.println("Member " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            teamData[i][0] = scanner.nextDouble();
            System.out.print("Height (cm): ");
            teamData[i][1] = scanner.nextDouble();
        }

        // Calculate BMI for all members
        calculateBMI(teamData);

        // Determine BMI status
        String[] bmiStatuses = determineBMIStatus(teamData);

        // Display results
        System.out.printf("%-10s %-10s %-10s %-20s%n", "Weight(kg)", "Height(cm)", "BMI", "BMI Status");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < numMembers; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-20s%n",
                    teamData[i][0], teamData[i][1], teamData[i][2], bmiStatuses[i]);
        }

        scanner.close();
    }
}
