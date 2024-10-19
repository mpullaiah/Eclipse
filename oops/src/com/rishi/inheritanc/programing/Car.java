package com.rishi.inheritanc.programing;

public class Car extends Vehicle {
	@Override
	void start() {
System.out.println("car is starting...");		
	}
	 static void drive() 
	{
		System.out.println("car is being is driven");
	}
	void stop() {
		System.out.println("car is stopping.....");
	}

}
