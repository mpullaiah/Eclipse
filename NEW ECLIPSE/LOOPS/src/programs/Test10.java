package programs;

public class Test10 {

	public static void main(String[] args) {
		        for (int num = 50; num <= 150; num++) {
		            boolean isPrime = true;
		            for (int i = 2; i <= num / 2; i++) {
		                if (num % i == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }
		            
		            if (isPrime && num > 1) {
		                System.out.println(num);
		            }
		        }
	}

}
