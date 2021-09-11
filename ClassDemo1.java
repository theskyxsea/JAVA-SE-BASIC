import java.util.Scanner;
class ClassDemo1
{
	public static void main(String[] args)
	{
		Scanner ak = new Scanner(System.in);
		System.out.println("Enter Radious");
		double num = ak.nextDouble();
		ClassDemoInner.area(num);
		ClassDemoInner.circum(num);
	}
}
class ClassDemoInner
{
	static void area(double rad)
	{
		double areac=3.14*rad*rad;
		System.out.println("area = "+areac);
	}
	static void circum(double rad)
	{
		double circum = 2*3.14*rad;
		System.out.println("circumferance = "+circum);
	}
}