package Rishi;

public class Demo1 {

	public static void main(String[] args) {
		add();
		int difference=sub();
		System.out.println("Difference:"+difference);
		int a=10;
		int b=20;
		mul(a,b);
		double divres=div(20,10);
	}
	public static void  add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("AdditionResult:"+c);
	}
	public static int sub()
	{
		int num1=20;
		int num2=10;
		int num3 =num1-num2;
		return num3;
	}
	public static void mul(int num1,int num2)
	{
		int product=num1*num2;
		System.out.println("Product:"+product);
	}
	public static double div(int numerator,int denominator)
	{
		double quotient=numerator/denominator;
		return quotient;
	}
		
		
		// TODO Auto-generated method stub

	}


