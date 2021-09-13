import java.util.Scanner;
class bill
{
	static double perUnitRes = 4.40;
	static double perUnitCom = 5.40;
	void residencial(int cUnit , int pUnit)
	{
		int uUsed = cUnit-pUnit;
		double costR= uUsed*perUnitRes;
		System.out.println("YOUR TOTAL BILL IS "+costR);
	}
	void commercial (int cUnit,int pUnit)
	{
		int uUsed = cUnit-pUnit;
		double costC = uUsed*perUnitCom;
		System.out.println("YOUR TOTAL BILL IS "+costC);
	}
}
class MainApp1
{
	public static void main (String [] args)
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("ENTER COURRENT READING");
		int cUnit = sc1.nextInt();
		System.out.println("ENTER PREVIOUS READING");
		int pUnit = sc1.nextInt();
		System.out.println("SELECT CONNECTION TYPE");
		System.out.println("1.RESIDENCIAL");
		System.out.println("2.COMMERCIAL");
		int choice = sc1.nextInt();
		if(choice==1)
		{
			new bill().residencial(cUnit,pUnit);
		}
		else if (choice==2)
		{
			new bill().commercial(cUnit,pUnit);
		}
		else
		{
			System.out.println("INVALID INPUT");
		}
	}
}