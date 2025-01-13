import java.util.Random;

public class ZaraBonus {

    public static int[][] getEmployeeData(int numEmployees) {
        int[][] employeeData = new int[numEmployees][2]; // 2D array: [salary, yearsOfService]
        Random rand = new Random();

        for (int i = 0; i < numEmployees; i++) {
            employeeData[i][0] = rand.nextInt(90000) + 10000; // Generate random salary between 10,000 and 99,999
            employeeData[i][1] = rand.nextInt(10) + 1; // Generate random years of service between 1 and 10
        }

        return employeeData;
    }

    public static int[][] calculateNewSalaryAndBonus(int[][] employeeData) {
        int[][] updatedData = new int[employeeData.length][3]; // [oldSalary, newSalary, bonus]

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonusPercentage = yearsOfService > 5 ? 0.05 : 0.02;
            int bonus = (int) (oldSalary * bonusPercentage);
            int newSalary = oldSalary + bonus;

            updatedData[i][0] = oldSalary;
            updatedData[i][1] = newSalary;
            updatedData[i][2] = bonus;
        }

        return updatedData;
    }

    public static void displayResults(int[][] updatedData) {
        int totalOldSalary = 0;
        int totalNewSalary = 0;
        int totalBonus = 0;

        System.out.println("--------------------------------------------------");
        System.out.println("Employee\tOld Salary\tNew Salary\tBonus");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < updatedData.length; i++) {
            System.out.printf("%d\t%d\t\t%d\t\t%d\n", 
                    i + 1, 
                    updatedData[i][0], 
                    updatedData[i][1], 
                    updatedData[i][2]);

            totalOldSalary += updatedData[i][0];
            totalNewSalary += updatedData[i][1];
            totalBonus += updatedData[i][2];
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Totals:\t" + totalOldSalary + "\t" + totalNewSalary + "\t" + totalBonus);
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) {
        int numEmployees = 10; // Number of employees
        int[][] employeeData = getEmployeeData(numEmployees);
        int[][] updatedData = calculateNewSalaryAndBonus(employeeData);
        displayResults(updatedData);
    }
}