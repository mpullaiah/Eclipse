package com.rishi.oops.abstraction;

	import java.util.Scanner;
	public class Operations {
  
	    // Method for addition
	    public double add(double a, double b) {
	        return a + b;
	    }

	    // Method for subtraction
	    public double subtract(double a, double b) {
	        return a - b;
	    }

	    // Method for multiplication
	    public double multiply(double a, double b) {
	        return a * b;
	    }

	    // Method for division
	    public double divide(double a, double b) {
	        if (b != 0) {
	            return a / b;
	        } else {
	            System.out.println("Error: Division by zero");
	            return 0;
	        }
	    }

	    // Method for finding the remainder
	    public int remainder(int a, int b) {
	        return a % b;
	    }

	    // Method to raise a number to a power
	    public double power(double base, double exponent) {
	        return Math.pow(base, exponent);
	    }

	    // Method to print the first 'n' Fibonacci numbers
	    public void printFibonacci(int n) {
	        int a = 0, b = 1;
	        System.out.print("Fibonacci Series: " + a + " " + b);

	        for (int i = 2; i < n; i++) {
	            int next = a + b;
	            System.out.print(" " + next);
	            a = b;
	            b = next;
	        }
	        System.out.println();
	    }

	    // Method to check if a number is prime
	    public boolean isPrime(int n) {
	        if (n <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    // Method to reverse a number and check if it is a palindrome
	    public boolean isPalindrome(int n) {
	        int original = n, reversed = 0;

	        while (n != 0) {
	            int digit = n % 10;
	            reversed = reversed * 10 + digit;
	            n /= 10;
	        }
	        return original == reversed;
	    }

	    // Main method to test the operations
	    public static void main(String[] args) {
	        Operations ops = new Operations();
	        Scanner sc = new Scanner(System.in);

	        // Testing addition
	        System.out.println("Addition: " + ops.add(10, 5));

	        // Testing subtraction
	        System.out.println("Subtraction: " + ops.subtract(10, 5));

	        // Testing multiplication
	        System.out.println("Multiplication: " + ops.multiply(10, 5));

	        // Testing division
	        System.out.println("Division: " + ops.divide(10, 5));

	        // Testing remainder
	        System.out.println("Remainder: " + ops.remainder(10, 3));

	        // Testing power
	        System.out.println("Power: " + ops.power(2, 3));

	        // Testing Fibonacci series
	        System.out.print("Enter the number of Fibonacci terms: ");
	        int fibCount = sc.nextInt();
	        ops.printFibonacci(fibCount);

	        // Testing prime check
	        System.out.print("Enter a number to check if it's prime: ");
	        int primeCheck = sc.nextInt();
	        System.out.println(primeCheck + " is prime? " + ops.isPrime(primeCheck));

	        // Testing palindrome check
	        System.out.print("Enter a number to check if it's a palindrome: ");
	        int palindromeCheck = sc.nextInt();
	        System.out.println(palindromeCheck + " is palindrome? " + ops.isPalindrome(palindromeCheck));
	    }
	}

