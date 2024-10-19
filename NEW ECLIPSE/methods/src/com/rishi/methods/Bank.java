package com.rishi.methods;

public class Bank {
	static int currentBalance =1000;
	public static void greetCustomer() {
		System.out.println("Hello,Welocme to the baking area");
	}
	public void deposit(int amount) {
		currentBalance = currentBalance +amount;
		System.out.println("Amount is deposited with succesfully");
	}
	public void withdrawal(int amount) {
		currentBalance = currentBalance +amount;
		System.out.println("Amount is withdrawal with succesfully");
	}
	public  int  getCurrentBalance() {
		return currentBalance;
	}
public static void main(String[] args) {
	Bank bank = new Bank();
	greetCustomer();
	
	
}
}
