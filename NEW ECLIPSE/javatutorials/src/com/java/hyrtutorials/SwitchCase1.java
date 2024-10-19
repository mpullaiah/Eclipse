package com.java.hyrtutorials;
import java.util.Scanner;
public class SwitchCase1 {
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter a number: ");
int number =scan.nextInt();
// use modulate operator to check if the number is even or odd......
int result = number % 2;
// switch the result to check if the number is even or odd..........
switch (result) {
case 0:
	System.out.println(number + " is an even number.");
	break;
case 1:
	System.out.println(number + " is an odd number.");
	break;
	default:
		System.out.println("Invalid Input.");
		break;
}
scan.close();


	}
}
