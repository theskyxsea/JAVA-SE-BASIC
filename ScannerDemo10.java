import java.util.Scanner;
class ScannerDemo10
{
	public static void main(String [] args)
	{
		Scanner ak = new Scanner(System.in);
		System.out.println("ENTER SUBJECT NAME");
		String subject = ak.nextLine();
		System.out.println("SUBJECT NAME IS "+subject);
	}
}