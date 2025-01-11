import java.util.Scanner;

public class Quadratic {

    // Method to find the roots of a quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        // Calculate the discriminant (delta)
        double delta = Math.pow(b, 2) - 4 * a * c;

        // If delta is negative, no real roots
        if (delta < 0) {
            return new double[0]; // Return an empty array
        }
        // If delta is zero, one real root
        else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root}; // Return a single root
        }
        // If delta is positive, two real roots
        else {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2}; // Return both roots
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take coefficients a, b, and c as input
        System.out.print("Enter the coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the coefficient c: ");
        double c = scanner.nextDouble();

        // Find the roots
        double[] roots = findRoots(a, b, c);

        // Display the results
        if (roots.length == 0) {
            System.out.println("The equation has no real roots.");
        } else if (roots.length == 1) {
            System.out.printf("The equation has one real root: x = %.2f%n", roots[0]);
        } else {
            System.out.printf("The equation has two real roots: x1 = %.2f, x2 = %.2f%n", roots[0], roots[1]);
        }

        scanner.close();
    }
}
