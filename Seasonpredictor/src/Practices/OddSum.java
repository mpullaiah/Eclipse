package Practices;

public class OddSum {

	public static void main(String[] args) {
		        int sum = 0;

		        // Calculate the sum of all odd numbers between 1 and 50
		        for (int i = 1; i <= 50; i++) {
		            if (i % 2 != 0) { // Check if the number is odd
		                sum += i;
		            }
		        }
		        System.out.println("The sum of all odd numbers between 1 and 50 is " + sum + ".");
		    }
	}
