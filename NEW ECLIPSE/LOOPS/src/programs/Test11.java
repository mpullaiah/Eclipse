package programs;

public class Test11 {

	public static void main(String[] args) {
		        int sum = 0;
		        
		        for (int num = 40; num <= 80; num++) {
		            if (num % 2 == 0) {
		                sum += num;
		            }
		        }
		        
    System.out.println("The sum of even numbers between 40 and 80 is: " + sum);

	}

}
