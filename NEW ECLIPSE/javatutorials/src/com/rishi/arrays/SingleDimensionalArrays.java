package com.rishi.arrays;

public class SingleDimensionalArrays {

	public static void main(String[] args) {	
 		int []j = new int[5];
 		
 		j[0]=5; 
 		j[1]=2;
 		j[3]=8;
 		j[4]=38;
 		//override in j[2]in that values;
 		j[2]=45;
 		j[2]=85;

 		//System.out.println(j[2]);
// 		for(int i = 0; i<j.length; i++) {
// 			System.out.println(j[i]);
 //		}
// 		int sum =j[0]+j[1]+j[2]+j[3]+j[4];
// 		System.out.println(sum)
 		int i =0;
 		while(i<j.length) {
 			System.out.println(j[i]);
 			i++;
 		
 		}
	}
}


