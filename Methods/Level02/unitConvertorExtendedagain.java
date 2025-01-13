import java.util.Scanner;
	
public class unitConvertorExtendedagain{


// Convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

// Convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

// Convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

// Convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

// Convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

// Convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }
	public static void main(String[] args) {

       // printing values for static variables, in previous questions i have taken  input for each.

	 // Example usage
        System.out.println("32°F to Celsius: " + 	convertFahrenheitToCelsius(32) + "°C");

        System.out.println("0°C to Fahrenheit: " +  	convertCelsiusToFahrenheit(0) + "°F");	

        System.out.println("100 pounds to kilograms: " + 	
	convertPoundsToKilograms(100) + " kg");

        System.out.println("50 kilograms to pounds: " + 	convertKilogramsToPounds(50) + " lbs");

        System.out.println("10 gallons to liters: " + 	convertGallonsToLiters(10) + " L");

        System.out.println("20 liters to gallons: " + 	convertLitersToGallons(20) + " gallons");
    
	    }
}