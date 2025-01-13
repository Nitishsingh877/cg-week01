import java.util.Scanner;

public class CalendarGenerator {

    private static final String[] MONTHS = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    private static final int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static String getMonthName(int month) {
        return MONTHS[month - 1];
    }

    public static int getDaysInMonth(int month, int year) {
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        }
        return DAYS_IN_MONTH[month - 1];
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getFirstDayOfWeek(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;
        return d0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDayOfWeek = getFirstDayOfWeek(month, year);

        System.out.println("\n" + monthName + " " + year);
        System.out.println("-----------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Indentation for the first day of the month
        for (int i = 0; i < firstDayOfWeek; i++) {
            System.out.print("   ");
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d", day);
            if ((day + firstDayOfWeek) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n");
    }
}