package Practices;

public class ArmstrongNumber {
public static void main(String[] args) {
}

boolean checkArmstrong(int num) {
	int originalNumber=num;
		int digitCount=ArmstrongNumber.digitCount(num);
		int finalNumber=0;
		while(num!=0) {
			int dig=num%10;
			int powers=ArmstrongNumber.getPower(dig,digitCount);
			finalNumber=finalNumber+powers;
			num=num/10;
		}
		if(finalNumber==originalNumber)
		{
			return true;
		}
		else
		{
			return false;
		}
}
 static int digitCount(int n)
 {
	 int count=0;
	 while(n!=0)
	 {
		 int rem=n%10;
		 count++;
		 n=n/10;
	 }
	 return count;
 }
static int getPower(int digit,int raisePower)
{
	int res=1;
	for(int i=1;i<=raisePower;i++)
	{
		res=res*digit;//res=27
	}
	return res;

}
}
 