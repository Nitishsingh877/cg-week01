import java.util.Scanner;

public class CollinearPoints {

    public static double calculateSlope(double x1, double y1, double x2, double y2) {
        if (x1 == x2) {
            return Double.POSITIVE_INFINITY; // Handle vertical line
        }
        return (y2 - y1) / (x2 - x1);
    }

    public static boolean areCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = calculateSlope(x1, y1, x2, y2);
        double slopeBC = calculateSlope(x2, y2, x3, y3);
        double slopeAC = calculateSlope(x1, y1, x3, y3);

        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    public static boolean areCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return Math.abs(area) < 1E-9; // Account for potential floating-point errors
    }

    public static void main(String args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        System.out.print("Enter x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = scanner.nextDouble();

        if (areCollinearUsingSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear using slope method.");
        } else {
            System.out.println("Points are not collinear using slope method.");
        }

        if (areCollinearUsingArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear using area method.");
        } else {
            System.out.println("Points are not collinear using area method.");
        }

        scanner.close();
    }
}