import java.util.Scanner;

public class TwoDArrayToOneD {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Create a 2D array
        int[][] matrix = new int[rows][columns];

        // Take user input to populate the 2D array
        System.out.println("Enter the elements of the 2D array (matrix):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at (" + i + "," + j + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Create a 1D array to store the elements of the 2D array
        int[] array = new int[rows * columns];
        int index = 0;

        // Copy elements from the 2D array to the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // Print the elements of the 1D array
        System.out.println("1D array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}


//input rows and columns
//create 2D array
//input elements using two loops nested. i and j.
//1D array create and size will be row*column and create index as well.
// by help of two loop we will send it to 1d array and index++.
// output the results using single loop
