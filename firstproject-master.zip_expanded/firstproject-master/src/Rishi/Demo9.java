package Rishi;
import java.util.Scanner;
public class Demo9 {

	public static void main(String[] args) {
		Scanner scan=new  Scanner(System.in);
		System.out .println("enter the value");
		int n = scan.nextInt();
		
		int factorial=1;
		for(int i=1;i<=n;i++) {
			System.out.println(factorial+" * "+i+" = ");
		factorial = factorial *i;
		System.out.println(factorial);
	}
		
   System.out.println("FACTORIAL OF  NUMBER  "+n+" is "+factorial);
}

}

