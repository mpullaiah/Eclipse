package Rishi;
import java.util.Scanner;
public class Demo4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the number 1 to 10");
		int marks =scan.nextInt();
		
				
		switch(marks) {
		case 1:
			System.out.println("Grade-A");
			break;
		case 2:
			System.out.println("Grade-B");
			break;
		case 3:
			System.out.println("Grade-C");
			break;
		case 4:
			System.out.println("Grade-D");
			break;
		case 5:
			System.out.println("Grade-E");
		}
	}
}
		