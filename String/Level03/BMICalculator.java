import java.util.Scanner;

public class BMICalculator {

    public static String[][] calculateBMI(double[][] heightWeight) {
        String[][] bmiResults = new String[heightWeight.length][4];
        for (int i = 0; i < heightWeight.length; i++) {
            double weight = heightWeight[i][0];
            double height = heightWeight[i][1] / 100.0;

            double bmi = weight / (height * height);
            bmi = Math.round(bmi * 100.0) / 100.0;

            String status;
            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi < 24.9) {
                status = "Normal Weight";
            } else if (bmi < 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            bmiResults[i][0] = String.valueOf(heightWeight[i][1]);
            bmiResults[i][1] = String.valueOf(weight);
            bmiResults[i][2] = String.valueOf(bmi);
            bmiResults[i][3] = status;
        }
        return bmiResults;
    }

    public static void displayResults(String[][] bmiResults) {
        System.out.println("Person Height (cm) Weight (kg) BMI Status");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < bmiResults.length; i++) {
            System.out.printf("%d %s %s %s %s%n",
                    (i + 1), bmiResults[i][0], bmiResults[i][1], bmiResults[i][2], bmiResults[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] heightWeight = new double[10][2];

        System.out.println("Enter height (in cm) and weight (in kg) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d:%n", (i + 1));
            System.out.print("Height (cm): ");
            heightWeight[i][1] = scanner.nextDouble();
            System.out.print("Weight (kg): ");
            heightWeight[i][0] = scanner.nextDouble();
        }

        String[][] bmiResults = calculateBMI(heightWeight);

        displayResults(bmiResults);

        scanner.close();
    }
}

