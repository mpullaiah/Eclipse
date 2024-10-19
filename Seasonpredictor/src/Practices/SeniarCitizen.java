
package Practices;
import java.util.Scanner;
public class SeniarCitizen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >= 65) {
            System.out.println("You are eligible for a senior citizen discount.");
        } else {
            System.out.println("You are not eligible for a senior citizen discount.");
        }
        scanner.close();
    }
}

