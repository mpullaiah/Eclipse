package com.rishi.oops.constructor;

public class Student {
String name;
int age;
String gender;
int marks;
public Student(String name,int age,String gender,int marks) {
	this.name=name;
	this.age=age;
	this.gender=gender;
	this.marks= marks;
}
	//copy costructor
	public Student(Student ref) {
		this.name=ref.name;
		this.age=ref.age;
		this.gender=ref.gender;
		this.marks=ref.marks;
	}
	
}


