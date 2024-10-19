package Rishi;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		

		Scanner scan=new Scanner (System.in);
		System.out.println("Enter Your marks out of 100");
	
    int marks =scan.nextInt();
       int score =marks/10;
		
				
		switch(score) {
		case 10:
		case  9:
		case  8:
			System.out.println("Grade-A");
			
			break;
		case 7:
		case 6:
		case 5:
			System.out.println("Grade-B");
			
			break;
		case 4:
		case 3:
		case 2:
			System.out.println("Grade-C");
		
		case1:
			
			System.out.println("GRade-D");
        
        default:
        System.out.println("Grade-E");
        
		}
	}
}
		
