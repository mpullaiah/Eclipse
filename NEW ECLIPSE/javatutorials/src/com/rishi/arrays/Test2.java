package com.rishi.arrays;
import java.util.Arrays;
public class Test2 {

	public static void main(String[] args) {
int[]arr = {2,5,9,3,6};
 int sum =0;
 for(int arr1:arr) {
	 sum+=arr1;
 }
 double average =(double) sum/arr.length;
 System.out.println("The average is: " + average);
	}

}
