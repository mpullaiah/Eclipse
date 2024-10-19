package com.rishi.inheritanc.programing;

public class VehicleApp {
public static void main(String[] args) {
	
	Car ref=new Car();
	ref.start();
	ref.drive(); //car.drive();
	ref.stop();
	
	Vehicle ref2 =new Car();
	ref2.start();
	ref2.drive();
	ref2.stop();
	
}
}
