import java.util.Random;

public class MatrixOperations {

    public static int[][] generateRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Generate random numbers between 0 and 9
            }
        }

        return matrix;
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        if (cols1 != rows2) {
            System.out.println("Matrix multiplication not possible. Incompatible dimensions.");
            return null;
        }

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) -
                matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) +
                matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    public static double[][] inverse2x2(int[][] matrix) {
        int det = determinant2x2(matrix);
        if (det == 0) {
            System.out.println("Matrix is singular. Inverse does not exist.");
            return null;
        }

        double[][] inverse = new double[2][2];
        inverse[0][0] = (double) matrix[1][1] / det;
        inverse[0][1] = (double) -matrix[0][1] / det;
        inverse[1][0] = (double) -matrix[1][0] / det;
        inverse[1][1] = (double) matrix[0][0] / det;

        return inverse;
    }

    // ... (Implement inverse3x3 method using appropriate formulas)

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 2;
        int cols = 2;

        int[][] matrix1 = generateRandomMatrix(rows, cols);
        int[][] matrix2 = generateRandomMatrix(rows, cols);

        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        System.out.println("Matrix 2:");
        displayMatrix(matrix2);

        System.out.println("\nAddition:");
        int[][] sum = addMatrices(matrix1, matrix2);
        displayMatrix(sum);

        System.out.println("\nSubtraction:");
        int[][] difference = subtractMatrices(matrix1, matrix2);
        displayMatrix(difference);

        System.out.println("\nMultiplication:");
        int[][] product = multiplyMatrices(matrix1, matrix2);
        if (product != null) {
            displayMatrix(product);
        }

        System.out.println("\nTranspose of Matrix 1:");
        int[][] transpose1 = transposeMatrix(matrix1);
        displayMatrix(transpose1);

        System.out.println("\nDeterminant of Matrix 1 (if 2x2):");
        if (rows == 2 && cols == 2) {
            System.out.println(determinant2x2(matrix1));
        } else {
            System.out.println("Determinant calculation for matrices other than 2x2 or 3x3 is not implemented.");
        }

        System.out.println("\nInverse of Matrix 1 (if 2x2):");
        if (rows == 2 && cols == 2) {
            double[][] inverse1 = inverse2x2(matrix1);
            if (inverse1 != null) {
                // Display the inverse matrix (using double values for better precision)
                for (double[] row : inverse1) {
                    for (double element : row) {
                        System.out.printf("%.2f ", element);
                    }
                    System.out.println();
                }
            }
        } else {
            System.out.println("Inverse calculation for matrices other than 2x2 is not implemented.");
        }
    }
}