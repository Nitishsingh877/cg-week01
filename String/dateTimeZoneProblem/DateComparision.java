import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Define a date-time formatter for displaying the time in a readable format
        DateTimeFormatter formatterdd = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Take two date inputs from the user
        System.out.println("Enter the first date (dd/MM/yyyy): ");
        String firstDateInput = sc.nextLine();

        System.out.println("Enter the second date (dd/MM/yyyy): ");
        String secondDateInput = sc.nextLine();

        // Parse the input dates using DateTimeFormatter
        LocalDate firstDate = LocalDate.parse(firstDateInput, formatterdd);
        LocalDate secondDate = LocalDate.parse(secondDateInput, formatterdd);

        // Compare the two dates
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("The two dates are equal.");
        }

        // Close the scanner
        sc.close();



    }
}