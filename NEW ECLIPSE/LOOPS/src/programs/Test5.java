package programs;

public class Test5 {

	public static void main(String[] args) {
		int i = 40;
		int sum =0;
		while(i<80) {
			if(i%2 ==0) {
				sum+=i;
				System.out.println("Sum of even numbers between 40 and 80 is: " + sum);
			}
				i++;
		}
	}
}
// int i = 40;
// int sum =0;
// do {
//	 if(i%2==0) {
//		 sum+=i;
//	System.out.println("Sum of even numbers between 40 and 80 is: " + sum);
//	 }
//		 i++;
//	 } while(i<=80);
//	}
//	}

