package com.rishi.polymorphism;

public class Demo1 extends Demo   {
int display() {
	System.out.println("Hello");
	
	return 3;
}
Elephant display1() {
	System.out.println("Hello my world");
	return new Elephant();
}
}
