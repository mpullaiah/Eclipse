package com.rishi.interfaces;


public class WelcomeLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Greeting greeting = () -> {
	String name = null;
	System.out.println("HELLO");
};
	
greeting.greet();
	}

}
