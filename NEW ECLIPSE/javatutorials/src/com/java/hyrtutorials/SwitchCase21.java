package com.java.hyrtutorials;
import java.util.Scanner;
public class SwitchCase21 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double num1 =scan.nextDouble();

		System.out.println("Enter the second number: ");
		double num2 =scan.nextDouble();
		
		System.out.println("Choosen an operation: ");
		System.out.println("1: Addition (+)");
		System.out.println("2: Subraction (-)");
		System.out.println("3: Multiplication (*)");
		System.out.println("4: Division (/)");
		
		
		System.out.print("Enter your choice(1/2/3/4): ");
		int choice =scan.nextInt();
		switch(choice) { 
		case 1:
			System.out.println("Result: " + (num1 + num2));
		break;
		case 2:
			System.out.println("Result: " + (num1 - num2));
			break;
		case 3:
			System.out.println("Result: " + (num1 * num2 ));
			break;
		case 4:
			System.out.println("Result: " + (num1 / num2));
			break;
			default:
				System.out.println("Invalid choice. Please enter the numbers(1/2/3/4).");
				break;
		}
		scan.close();
		

	}
}
