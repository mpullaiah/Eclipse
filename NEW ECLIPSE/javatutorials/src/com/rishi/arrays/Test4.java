package com.rishi.arrays;

public class Test4 {
	public static void main(String[] args) {
		int[] numbers= {2,5,1,9,6};
		int max =numbers[0];
		int index =0;
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>max) {
				max = numbers[i];
				index=i;
			}
		}
		System.out.println("Value -" + max + "Index - " + index);
	}
}
