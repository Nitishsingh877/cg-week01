import java.util.Scanner;

public class ToggleCase {


 // Method to find the toogglecase

    public static String togglecase(String str) {
        
		StringBuilder sb = new StringBuilder();
		for(char c: str.toCharArray()) {
		if(Character.isUpperCase(c)){
			sb.append(Character.toLowerCase(c));		
	}	else {
			sb.append(Character.toUpperCase(c));
			}
		}
		  return sb.toString();		
    }
	    
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a sentence
        System.out.print("Enter a words: ");
        String str = scanner.nextLine();
	
       String toggledString =  togglecase(str);

        System.out.println("Original String: " + str);
        System.out.println("Toggled String: " + toggledString);   
 }
   }
