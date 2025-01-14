public class CurrentDate {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        // Define a date-time formatter for displaying the time in a readable format
        DateTimeFormatter formatterdd = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterhyphen = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatterWithDAy = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Current date in /: " + currentDate.format(formatterdd));
        System.out.println("Current date in hyphen: " + currentDate.format(formatterhyphen));
        System.out.println("Current date in day: " +currentDate.format(formatterWithDAy));
    }
}