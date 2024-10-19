package com.rishi.loopingstatements;

public class Test4 {
	public static void main(String[] args) {
	int i =50;
	while (i<=150) {
		if(isPrime(i)) {
		System.out.println(i + "is a prime number");
	}
		i++;
}
	}
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i =2; i<= Math.sqrt(n); i++) {
			if (n % i ==0) {
			return false;
		}
		}
	return true;
	}
}