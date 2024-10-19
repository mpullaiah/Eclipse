package Practices;

public class practice1 {

	public static void main(String[] args) {
	}
	void predictSeason(int monthNum)
	{	
		switch(monthNum)
		{
		case 12:
		case 1:
		case 2:System.out.println("The month number"+monthNum+ "correspends to Winter.");
		break;
		case 3:
		case 4:
		case 5:System.out.println("The month number"+monthNum+ "correspends to Spring.");
		case 6:
		case 7:
		case 8:System.out.println("The month number"+monthNum+ "correspends to Summer.");
		break;
		case 9:
		case 10:
		case 11:System.out.println("The month number"+monthNum+ "correspends to Fall.");
		break;
		default:System.out.println("The month number"+monthNum+ "correspends to Invalid numner.");
		}
}
}