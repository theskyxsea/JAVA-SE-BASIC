import java.util.Scanner;

class ScannerDemo1
{
	public static void main(String [] args)
	{
		Scanner sr1= new Scanner(System.in);
		System.out.println("Please Enter Quantity");
		int qty = sr1.nextInt();
		System.out.println("Please Enter Price");
		double price = sr1.nextDouble();
		bill(qty,price);
		
	}
	static void bill(int qty,double price)
	{
		double total = qty*price;
		System.out.println("Total Amount is "+total);
	}
}