import java.util.Scanner;

public class BmiOfPerson {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask the user double for the weight (in kg) of the person and height (in cm) 
        System.out.print("Enter a   weight (in kg): ");
        double weight = input.nextDouble();
	System.out.print("Enter a  height (in cm) : ");
        double height = input.nextDouble();


	// BMI = weight / (height * height)
	// unit is kg/m^2. For this convert cm to meter 1m =100cm.
	double heightinMeter = height/100;
	double BMI = weight/(heightinMeter*heightinMeter);

	if(BMI>=40){
	System.out.println("obese");
}	
	else if(BMI>=25.0 && BMI<=39.90 ){
	System.out.println("Overweight");
}	
	else if(BMI>=18.5 && BMI<=24.90 ){
	System.out.println("Normal");
}	
	else {
	System.out.println("Underweight");
}





        // Close the scanner
        input.close();
    }
}
