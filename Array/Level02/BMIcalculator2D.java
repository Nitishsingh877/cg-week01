import java.util.Scanner;

public class 	BMIcalculator2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

  // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();

        
 // Create arrays to store height, weight, BMI, and weight status
        //double[] heights = new double[numPersons];
        //double[] weights = new double[numPersons];
        //double[] bmiValues = new double[numPersons];

	double [][] personData = new double[numPersons][3]; // 0-height 1-weight 2-bmi
        String[] weightStatus = new String[numPersons];


 // Take input for height and weight of each person

 // Take input for height and weight of each person
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            
      // Input validation for height
            
	while (true) {
                System.out.print("Height (in meters): ");
                double height = input.nextDouble();
                if (height > 0) {
                    personData[i][0] = height;
                    break;
                } else {
                    System.out.println("Height must be positive. Please re-enter.");
                }
            }

  // Input validation for weight
            while (true) {
                System.out.print("Weight (in kilograms): ");
                double weight = input.nextDouble();
                if (weight > 0) {
                    personData[i][1] = weight;
                    break;
                } else {
                    System.out.println("Weight must be positive. Please re-enter.");
                }
            }
        }



// Calculate BMI and determine weight status
         for (int i = 0; i < numPersons; i++) {
            double height = personData[i][0];
            double weight = personData[i][1];
            personData[i][2] = weight / (height * height); // Calculate BMI
  
            // Determine weight status
            double bmi = personData[i][2];
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

 

 // Display results
        System.out.printf("%-10s %-10s %-10s %-20s%n", "Height", "Weight", "BMI", "Weight Status");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-20s%n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

       input.close();
    }
}