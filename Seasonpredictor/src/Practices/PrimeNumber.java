package Practices;

public class PrimeNumber {
boolean checkPrimeNumber(int n)
{
	if(n==2)
	{
		return true;
	}
	else
	{
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
		void printPrimeInRange(int start,int end)
		{
		for(int i=start;i<=end;i++)
		{
			boolean res= checkPrimeNumber(i);
			if(res==true)
			{
				System.out.println(i);
			}
	}
	
}
}
