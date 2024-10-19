package com.java.hyrtutorials;

public class conditoionalStatements {
	public static void main(String[] arrgs) {
	   String examStatus = "pass";
	   if(examStatus== "pass") {
		   System.out.println("please wait further rounds");
		   String round1Status = "pass";
		   if(round1Status== "pass") {
			   System.out.println("you have cleared round 1, Please wait for round 2");
			   String round2Status = "pass";
			   if(round2Status== "pass") {
			   System.out.println("you have cleared  round2 interview,please wait in HR round");			   
		   }
			   else {
				   System.out.println("You can go to home");			 
	   }
	}
		   else {
			   System.out.println("You can go to home");
		   }
	   }
	}
}
	
