import java.util.Scanner;

class ScannerDemo2
{
	public static void main(String [] args)
	{
		Scanner S1 = new Scanner(System.in);
		System.out.println("Please Enter Radius");
		double rad = S1.nextDouble();
		double output1 = areaOfCircle(rad);
		double output2 = circumferanceOfCircle(rad);
		System.out.println("Area of Circle is "+output1);
		System.out.println("Circumferance of Circle is "+output2);
	}
	static double areaOfCircle(double rad)
	{
		double areaC = 3.14*rad*rad;
		return areaC;
	}
	static double circumferanceOfCircle(double rad)
	{
		double circumferanceC = 2*3.14*rad;
		return circumferanceC;
	}
}