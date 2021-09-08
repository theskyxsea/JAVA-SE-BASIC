import java.util.Scanner;
class ScannerDemo5
{
	public static void main(String[] args)
	{
		Scanner ak = new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age = ak.nextInt();
		if(age>=18)
		{
			System.out.println("You are Elligible for Vaccination.");
		}
		else
		{
			System.out.println("You are not Elligible for Vaccination.");
		}
	}
}
