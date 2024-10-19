package democlass;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		takeInput();
	}
	public static void takeInput()
	{
	Scanner scanner =new Scanner(System.in);
		System.out.println("ENTER A CHARACTER");
		char ch=scanner.next().charAt(0);
		// add 5 to ch and store it in a variable ch2 ans print ch and ch2
		char ch2=(char)(ch+3);
		System.out.println("ENTERED CHARACTER IS "+" added 5 character is"+ch2 );
		// convert ch2 to integer and store it in variable x.left shift x two times 
		// print the result.
		int x=(int)ch2;
		int result =x<<2;
		System.out.println("RESULT AFTER LEFT SHIFT IS"+result);
		
		
		
		// square the result and print it
		int r1 =square(result);
		
			System.out.println("RESULT THE SQUARE IS "+r1);
		int r2 =cube(result);
		
		System.out.println("RESULT THE CUBE IS"+r2);
		//cube the result and print it.
	}
	public static int  square(int num)
	
	{
		// code the return square
		int sq=num*num;
		return sq;
	}
	public static int cube(int num)
	
	{
	    // write code to return cube
		int cu=num*num*num;
		return cu;
		
	}
		
         
	}


