import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define arrays to store data for 10 employees
        double[] salaries = new double[10];
        int[] yearsOfService = new int[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        // Variables to track total bonus, old salary, and new salary
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Loop to take input for salary and years of service for each employee
        

	    for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");

            // Input for salary (ensure it's valid)
            while (true) {
                System.out.print("Salary (must be a positive number): ");
                salaries[i] = input.nextDouble();
                if (salaries[i] > 0) break;
                System.out.println("Invalid salary! Please enter a positive number.");
            }

            // Input for years of service (ensure it's valid)
            while (true) {
                System.out.print("Years of Service (must be a non-negative number): ");
                yearsOfService[i] = input.nextInt();
                if (yearsOfService[i] >= 0) break;
                System.out.println("Invalid years of service! Please enter a non-negative number.");
            }

            // Calculate bonus and new salary
            double bonusPercentage = (yearsOfService[i] > 5) ? 0.05 : 0.02;


            bonuses[i] = salaries[i] * bonusPercentage; // Calculate the bonus
            newSalaries[i] = salaries[i] + bonuses[i]; // Calculate the new salary

            // Update total values
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Display total bonus, old salary, and new salary
        System.out.printf("\nTotal Bonus Payout: %.2f\n", totalBonus);
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);

        // Display individual results for each employee
        System.out.printf("\n%-10s %-15s %-15s %-15s %-15s\n", "Employee", "Old Salary", "Years of Service", "Bonus", "New Salary");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10d %-15.2f %-15d %-15.2f %-15.2f\n", i + 1, salaries[i], yearsOfService[i], bonuses[i], newSalaries[i]);
        }

        input.close();
    }
}
