package Practices;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int n = scanner.nextInt();
		        int num1 = 0, num2 = 1;
    
		        System.out.print("FibonacciSeries up to " + n + ": ");
		        if (n == 0) {
		            System.out.print(num1);
		        } else {
		            while (num1 <= n) {
		                System.out.print(num1 + " ");
		      
		                int nextNumber = num1 + num2;
		                num1 = num2;
		                num2 = nextNumber;
		            }
		        }
		        
		        scanner.close();
		    }
	}


