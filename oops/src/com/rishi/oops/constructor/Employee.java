package com.rishi.oops.constructor;

public class Employee extends Object {
	String name;
	int age;
	
	public Employee() {
		this(26);
		this.name ="Rishi";
		this.age =22;
	}
	public Employee(String name) {
		this.name =name;
		this.age =22;
	}
	public Employee(int age) {
		this.name ="Rishi";
		this.age =22;
		}
	public Employee(String name,int age) {
		this("Rishi");
		this.name =name;
		this.age=age;
	}
 }
