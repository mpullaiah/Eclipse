package com.rishi.oops.constructor;

public class ClassWorker extends Employee {
int salary;
int rating;
public ClassWorker() {
	this.salary=500000;
	this.rating=5;
}
public ClassWorker(int salary) {
	this();
	this.salary=150000;
	this.rating= 4;
}
public ClassWorker(int salary,int rating) {
	this(600000);
	this.salary=salary;
	this.rating=rating;
}
}



