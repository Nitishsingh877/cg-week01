import java.util.Scanner;

class twoDFortallNyoung {
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

// Create arrays to store ages and heights of the friends
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];


// Take input for ages and heights

        System.out.println("Enter the ages and heights of Amar, Akbar, and Anthony:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = input.nextInt();
            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = input.nextDouble();
        }

// Initialize variables to find the youngest and tallest
             int youngestIndex = 0;
       	     int tallestIndex = 0;

// Loop to find the youngest and tallest
             for (int i = 1; i < 3; i++) {
                  if (ages[i] < ages[youngestIndex]) {
                  youngestIndex = i;
            }
                  if (heights[i] > heights[tallestIndex]) {
                  tallestIndex = i;
            }
        }

	// Display the results
        System.out.println("The youngest friend is " + names[youngestIndex] + " with age " + ages[youngestIndex] + ".");
        System.out.println("The tallest friend is " + names[tallestIndex] + " with height " + heights[tallestIndex] + " cm.");
    

       // Close the Scanner Object
      input.close();
   }
}
