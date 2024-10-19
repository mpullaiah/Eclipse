package com.rishi.loops.forloop;

public class Test4 {
	public static void main(String[] args) {
	for (int i = 50;i <=150; i++) {
		if(isPrime(i)) {
			System.out.println(i);
		}
	}
}
	public static  boolean isPrime(int num) {
		if(num<=1) {
		}
		for(int i =2; i <=Math.sqrt(num);i++) {
			if(num % i == 0) {
			
			return false;
		}
		}
	return true;
	}
}
