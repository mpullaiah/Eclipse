package Practices;
import java.util.Scanner;
public class checknumbermanipulation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range To print prime numbers");
		int start=scan.nextInt();//2
		int end=scan.nextInt();//10
		PrimeNumber p=new PrimeNumber();
		p.printPrimeInRange(start,end);

	}

}
