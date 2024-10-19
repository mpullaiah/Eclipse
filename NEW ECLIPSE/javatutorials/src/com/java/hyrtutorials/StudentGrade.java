package com.java.hyrtutorials;

import java.util.Scanner;

public class StudentGrade {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a student score: ");
	int score =sc.nextInt();
	if(score < 35 ) {
		System.out.println("Student is a failed.");
	} else if(score==35) {
		System.out.println("Student is a pased.");
	} else if(score > 35 && score <=85) {
		System.out.println("Student secured third class.");
	} else if(score > 70 && score <=85) {
		System.out.println("student secured second class.");
	} else if(score >85) {
		System.out.println("Student secured first class. ");
	} else {
		System.out.println("Invalid Score");
			
		}
	sc.close();
}
}
