package com.rishi.oops.constructor;

public class Lion extends Animal {
String name="Rani";
void eat() {
	super.eat();
	System.out.println("MEAT.....");
}
void dispalyName() {
	System.out.println("super.name");
	System.out.println(name);
}

}

