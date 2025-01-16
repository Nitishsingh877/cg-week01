import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateArthimetic {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        // Add 7 days, 1 month, and 2 years to the initial date
        LocalDate modifiedDate = currentDate.plusDays(7)    // Add 7 days
                .plusMonths(1)  // Add 1 month
                .plusYears(2);  // Add 2 years

        // Subtract 3 weeks from the modified date
       LocalDate modifiedDateafterMinus = modifiedDate.minusWeeks(3);

        // Display the result
        System.out.println("Original date: " + currentDate.format(formatter));
        System.out.println("Modified date: " + modifiedDate.format(formatter));
        System.out.println("Modified date after minus: " + modifiedDateafterMinus.format(formatter));

    }
}
