class VeriableDemo
{
	public static void main (String[] args)
	{
		int qty=5;
		int price=25;
		double billAmt=(qty*price)-(0.05*(qty*price));
		System.out.println("Total amount aftr Discount is " + billAmt);
		
	}
}