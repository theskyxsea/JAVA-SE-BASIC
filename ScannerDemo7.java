import java.util.Scanner;
class ScannerDemo7
{
	public static void main (String [] args)
	{
		Scanner ak = new Scanner(System.in);
		System.out.println("ENTER FIRST NUMBER");
		int num1 = ak.nextInt();
		System.out.println("ENTER SECOND NUMBER");
		int num2 = ak.nextInt();
		if (num1>num2)
		{
			System.out.println("FIRST NUMNER IS GREATER.");
		}
		else if (num2>num1)
		{
			System.out.println("SECOND NUMBER IS GREATER");
		}
		else
		{
			System.out.println("BOTH NUMBERS ARE SAME");
		}
	}
}