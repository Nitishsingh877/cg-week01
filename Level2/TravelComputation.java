import java.util.Scanner;


// Create TravelComputation Class to compute the Distance and Travel Time
class TravelComputation {
   
   public static void main(String[] args) {

      


	 // Create a input object for input 

        Scanner input = new Scanner(System.in);

        // Taking user input  for  name, fromCity, viaCity, toCity
	//variable bonus and take user input

        System.out.print("Enter the name  :  ");
        String name   = input.nextLine();
	
	System.out.print("Enter the fromCity  :  ");
        String fromCity   = input.nextLine();

        System.out.print("Enter the viaCity  :  ");
        String viaCity   = input.nextLine();
	
	System.out.print("Enter the toCity  :  ");
        String toCity   = input.nextLine();

        // fromToVia and viaToFinalCity

	 System.out.print("Enter the diatance fromToVia  :  ");
        double distanceFromToVia   = input.nextDouble();
	
	System.out.print("Enter the distance viaToFinalCity  :  ");
        double distanceViaToFinalCity   = input.nextDouble();


	 System.out.print("Enter the time From To Via :  ");
        double timeFromToVia   = input.nextDouble();
	
	System.out.print("Enter the time Via To Final City  :  ");
        double timeViaToFinalCity   = input.nextDouble();
      
      
    
     

      

      
      // Create a variable totalDistance to indicate the total distance
     
      // between the fromCity to toCity

      double totalDistance = distanceFromToVia + distanceViaToFinalCity;

      // Create a variable totalTime to indicate the total time taken to
      // travel from fromCity to toCity in minutes
      double totalTime = timeFromToVia + timeViaToFinalCity;


      // Print the travel details
      System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");

input.close();
   }
}
