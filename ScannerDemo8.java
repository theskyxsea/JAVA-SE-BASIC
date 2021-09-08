import java.util.Scanner;
class ScannerDemo8
{
	public static void main(String [] args)
	{
		Scanner ak = new Scanner(System.in);
		System.out.println("ENTER NUMBER");
		int num = ak.nextInt();
		if (num>0)
		{
			if (num%2==0)
			{
				System.out.println("GIVEN NUMBER IS POSITIVE AS WELL AS EVEN");
			}
			else
			{
				System.out.println("GIVEN NUMBER IS POSITIVE AS WELL AS ODD");
			}
		}
		else
		{
			System.out.println("GIVEN NUMBER IS NEGATIVE");
		}
	}
	
}