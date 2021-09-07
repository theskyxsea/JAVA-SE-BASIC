import java.util.Scanner;
class ScannerMethod4
{
	public static void main(String[] args)
	{
		Scanner ak = new Scanner(System.in);
		System.out.println("Enter Product Name ");
		String pName = ak.next();
		System.out.println("Enter Product Price ");
		Double pPrice = ak.nextDouble();
		System.out.println("Enter Product Discount ");
		int pDisc = ak.nextInt();
		System.out.println("Product Name = "+pName);
		System.out.println("Product Price = "+pPrice);
		System.out.println("Product Discount = "+pDisc);
		double output = calcAmt(pPrice,pDisc);
		System.out.println("Final Amount = "+output);
	}
	static double calcAmt(double price,int disc)
	{
		double discount = disc*0.01*price;
		double amount= price - discount;
		return amount;
	}
}