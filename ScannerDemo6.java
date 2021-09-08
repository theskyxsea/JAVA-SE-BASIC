import java.util.Scanner;
class ScannerDemo6
{
	public static void main(String [] args)
	{
		Scanner ak = new Scanner(System.in);
		System.out.println("Enter Radius");
		double rad = ak.nextDouble();
		System.out.println("SELECT MODE OF OPERATION");
		System.out.println("1.AREA OF CIRCLE");
		System.out.println("2.CIRCUMFERANCE OF CIRCLE");
		int choice = ak.nextInt();
		if (choice==1)
		{
			areaOfCircle(rad);
		}
		else if(choice==2)
		{
			circumferanceOfCircle(rad);
		}
		else
		{
			System.out.println("INVALID OPTION");
		}
	}
	static void areaOfCircle(double radious)
	{
		double areaC=3.14*radious*radious;
		System.out.println("AREA OF CIRCLE IS "+areaC);
	}
	static void circumferanceOfCircle(double radious)
	{
		double circ = 2*3.14*radious;
		System.out.println("CIRCUMFERANCE OF CIRCLE IS "+circ);
	}
}