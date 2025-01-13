import java.util.Scanner;

public class LineEquation {

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] calculateEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2]; // Array to store slope and y-intercept

        if (x1 == x2) {
            // Handle vertical line (slope is undefined)
            result[0] = Double.POSITIVE_INFINITY; 
            result[1] = Double.NaN; 
            return result;
        }

        // Calculate slope (m)
        double slope = (y2 - y1) / (x2 - x1);

        // Calculate y-intercept (b)
        double yIntercept = y1 - (slope * x1);

        result[0] = slope;
        result[1] = yIntercept;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);

        double[] equation = calculateEquation(x1, y1, x2, y2);

        if (Double.isInfinite(equation[0])) {
            System.out.println("Equation of the line: x = " + x1); 
        } else {
            System.out.println("Equation of the line: y = " + equation[0] + "x + " + equation[1]);
        }

        scanner.close();
    }
}