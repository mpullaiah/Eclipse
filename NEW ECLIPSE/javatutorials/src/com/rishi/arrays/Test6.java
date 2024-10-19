package com.rishi.arrays;
import java .util.Arrays;
public class Test6 {

	public static void main(String[] args) {
boolean[]arr= {true,false,false,true,false,true};
int n =arr.length;
for(int i =0;i<n/2;i++) {
	boolean temp =arr[i];
	arr[i]=arr[n-i-1];
	arr[n-i-1]  =temp;
}
System.out.println("Reserved array: " +Arrays.toString(arr));
	}

}
