package com.rishi.loopingstatements;

public class Foreach {

	public static void main(String[] args) {
	  int[] arr= {1,4,6,7,4,9,5,2,4} ;
//		for (int i=0;i<arr.length;i++) {
//			System.out.println (arr[i] +"");
//		}
//	  int sum =0;
//	  for (int value:arr) {
//		  sum+=value;
//	  }
//		  System.err.println(sum);
//		  System.err.println(sum/arr.length);
//	}

	  int[][]arr1 = {
			  {2,4,5,},
			  {4,5,9},
			  {7,8,9},
	};
	  int sum =0;
	  int noOfElements=0;
	  for(int[]singleDimArray:arr1) {
		  for(int value:singleDimArray) {
			  sum+=value;
			  noOfElements++;
		  }
		  
	  }
	  System.err.println(sum);
	  System.err.print(sum/noOfElements);
	}
}

