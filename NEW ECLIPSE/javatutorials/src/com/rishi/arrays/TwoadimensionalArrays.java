package com.rishi.arrays;

public class TwoadimensionalArrays {
	public static void main(String[] args) {
//	int[][]arr=new int[3][2];
//arr[0][0] =1; 
//arr[0][1] =2; 
//
//arr[1][0] =3; 
//arr[1][1] =4; 
//
//arr[2][0] =5; 
//arr[2][1] =6; 
//
//int size =0;
//for(int i=0; i<arr.length;i++) {
//	size+=arr[i].length;
//}
//System.out.println(size);
//		int[][]arr= {
//				{1,2},
//				{3,4},
//				{5,6}
//		};
//		int size =0;
//		for(int i=0; i<arr.length;i++) {
//	for(int j =0;j<arr[i].length;j++) {
//		System.out.print(arr[i][j]+"  ");
//	}
//	System.out.println();
//		}
		
//		int [][]arr=new int[3][];
//		arr[0]=new int[2];
//	    arr[1]=new int[5];
//	    arr[2]=new int[3];
//	    
//	    arr[0][0]=1;
//	    arr[0][1]=2;
//	    
//	    arr[1][0]=25;
//	    arr[1][1]=50;
//	    arr[1][2]=75;
//	    arr[1][3]=100;
//	    arr[1][4]=125;
//	    
//	    arr[2][0]=3;
//	    arr[2][1]=4;
//	    arr[2][2]=5;
		int[][]arr= {
				{1,2},
				{3,5,6,},
				{10},
		};
		
		for(int i=0; i<arr.length;i++) {
		for(int j =0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"  ");
			}
	System.out.println();
	    
		}
	}
}

