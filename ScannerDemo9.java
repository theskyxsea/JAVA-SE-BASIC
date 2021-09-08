import java.util.Scanner;
class ScannerDemo9
{
	public static void main(String [] args)
	{
		Scanner ak = new Scanner(System.in);
		System.out.println("ENTER NUMBER");
		int num = ak.nextInt();
		if (num%5==0)
		{
			if (num%3==0)
			{
				System.out.println("NUMBER IS DIVISIBLE BY 5 AS WELL AS 3");
			}
			else
			{
				System.out.println("NUMBER IS DIVISIBLE BY 5 ONLY");
			}
		}
		else
		{
			System.out.println("NUMBER IS NOT DIVISIBLE BY 5.");
		}
	}
}