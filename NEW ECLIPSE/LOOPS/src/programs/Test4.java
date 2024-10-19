package programs;

public class Test4 {

	public static void main(String[] args) {
//int i =50;
// while (i<=150) {
//	 if (isPrime(i)) {
//		 System.out.println(i);
//	 }
//	 i++;
// }
//	}
//
// public static boolean isPrime(int number) {
//    if (number <= 1) return false;
//    for (int i = 2; i <= Math.sqrt(number); i++) {
//        if (number % i == 0) return false;
//    }
//    return true;
//}
	    int num = 50; 

        do {
            if (isPrime(num)) { 
                System.out.println(num); 
            }
            num++; 
        } while (num <= 150); 
    }

 
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
