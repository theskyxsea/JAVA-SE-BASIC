import java.util.Scanner;
class ClassDemo3
{
	public static void main(String [] args)
	{
		System.out.println("MAIN MENU");
		System.out.println("1.FIND ODD/EVEN");
		System.out.println("2.FIND AREA OF CIRCLE");
		System.out.println("3.FIND CIRCUMFERANCE OF CIRCLE");
		System.out.println("");
		System.out.println("=========================================");
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER CHOICE");
		int choice = sc.nextInt();
		MainMenu.choice(choice);
		
	}
}

class Operations
{
	static void oddEnen(double num)
	{
		if(num%2==0)
		{
			System.out.println("GIVEN NUMBER IS EVEN");
		}
		else
		{
			System.out.println("GIVEN NUMBER IS ODD");
		}
	}
}

class circle
{
	static void area(double rad)
	{
		double areac=3.14*rad*rad;
		System.out.println("AREA OF CIRCLE IS "+areac);
	}
	static void circum(double rad)
	{
		double circum = 2*3.14*rad;
		System.out.println("CIRCUMFERANCE OF CIRCLE IS "+circum);
	}
}

class MainMenu
{
	static void choice(int choice)
	{
		if(choice==1)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("ENTERR NUMBER");
			int num = sc.nextInt();
			Operations.oddEnen(num);
		}
		else if (choice ==2)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("ENTER RADIOUS");
			double rad = sc.nextDouble();
			circle.area(rad);
		}
		else if(choice==3)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("ENTER RADIOUS");
			double rad = sc.nextDouble();
			circle.circum(rad);
		}
		else
		{
			System.out.println("UNEXPECTED CHOICE");
		}
	}
}