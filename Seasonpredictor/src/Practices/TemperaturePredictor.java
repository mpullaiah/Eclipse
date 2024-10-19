package Practices;
import java.util.Scanner;
public class TemperaturePredictor {

	public static void main(String[] args) {
	 Scanner scanner =new Scanner(System.in);
 int temperature = scanner.nextInt();
 if (temperature < 0) {
        // Use Scanner to take user input
        String category;
        // Assign a category to the temperature
        if (temperature < 0) {
            category = "Freezing";
        } else if (temperature >= 0 && temperature <= 15) {
            category = "Cold";
        } else if (temperature >= 16 && temperature <= 25) {
            category = "Moderate";
        } else if (temperature >= 26 && temperature <= 35) {
            category = "Warm";
        } else {
            category = "Hot";
        }

        // Print the category
        System.out.println("The temperature " + temperature + " is categorized as " + category + ".");

        scanner.close();
    }
}

	}


