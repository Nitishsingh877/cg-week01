import java.util.ArrayList;
import java.util.List;

public class NumberCheckerEX6 {

    public static int[] findFactors(int number) {
        List<Integer> factorsList = new ArrayList<>();
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                factorsList.add(i);
            }
        }
        int[] factors = new int[factorsList.size()];
        for (int i = 0; i < factorsList.size(); i++) {
            factors[i] = factorsList.get(i);
        }
        return factors;
    }

    public static int findGreatestFactor(int[] factors) {
        int greatestFactor = 0;
        for (int factor : factors) {
            if (factor > greatestFactor) {
                greatestFactor = factor;
            }
        }
        return greatestFactor;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static int productOfCubeOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        return sumOfFactors(factors) == number;
    }

    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        return sumOfFactors(factors) > number;
    }

    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        return sumOfFactors(factors) < number;
    }

    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }
            sum += factorial;
            number /= 10;
        }
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        int number = 6; // Example number

        int[] factors = findFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));

        System.out.println("Greatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors));

        System.out.println("Is Perfect: " + isPerfectNumber(number));
        System.out.println("Is Abundant: " + isAbundantNumber(number));
        System.out.println("Is Deficient: " + isDeficientNumber(number));
        System.out.println("Is Strong: " + isStrongNumber(number));
    }
}