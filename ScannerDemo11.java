import java.util.Scanner;
class scannerDemo11
{
	public static void main(String [] args)
	{
		Scanner ak = new Scanner(System.in);
		System.out.println("ENTER NUMBER");
		int num = ak.nextInt();
		oddEven(num);
	}
	static void oddEven(int num)
	{
		if (num%2==0)
		{
			System.out.println("GIVEN NUMBER IS EVEN.");
		}
		else
		{
			System.out.println("GIVEN NUMBER IS ODD");
		}
	}
}