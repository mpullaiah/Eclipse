package com.rishi.interfaces;

public class Welcome {
	public static void main(String[] args) {
		Greeting greeting = new Greeting() {

			public void greet() {
				System.out.println("Hello..");
				
			}

	};
	greeting.greet();
	}
}

