import java.util.Scanner;

public class SubStringOccurence {


 // Method to find the longest word in a sentence

    public static int findOccurence(String sentence, String subString) {
        
		int count = 0;
         	int index = 0;	
		
		while ((index = sentence.indexOf(subString, index)) != -1) {
            		count++;
           		index += subString.length(); 
        }

        return count;
    }
	    
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
	System.out.print("Enter a subString: ");
        String subString = scanner.nextLine();


       int occurrences = findOccurence(sentence, subString);

        System.out.println("The substring '" + subString + "' occurs " + occurrences + " times in the string.");   
 }
   }
