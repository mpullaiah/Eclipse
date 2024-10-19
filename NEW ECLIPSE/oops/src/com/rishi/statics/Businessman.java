package com.rishi.statics;
import java . util.Scanner;
public class Businessman {
	int p;
	 int t;
	 float r;
	 float si;
	 void takeInput() {
		 Scanner scan =new Scanner(System.in);
		 System.out.println("Enter p");
		 p=scan.nextInt();
		 System.out.println("Enter time");
		 t = scan.nextInt();
		 r = 2.0f;
	 }
		 void calculatesI() {
			 si =(p*t*r)/100;
		 }
		 void displaysI() {
			 System.out.println("sI is "+si);
	 }

}
