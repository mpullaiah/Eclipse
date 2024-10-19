package com.java.hyrtutorials;

import java.util.Scanner;

public class DayStatement {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the day of the week: ");
	String day =sc.nextLine().trim().toLowerCase();
	switch (day) {
	case "monday":
	case "thuesday":
	case "wednesday":
	case "thursady":
	case "friday":
		System.out.println("Uff, It's a weekday.");
		break;
	case "saturday":
	case "sunday":
		System.out.println("Yyy, It's a Weekend.");
		break;
		default:
			System.out.println("invalid day entered");
		}
		
	}
}
