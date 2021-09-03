class MethodDemo8
{
	public static void main(String [] args)
	{
		double output = gstBill();
		System.out.println("Final amount with GST = "+output);
	}
	static double total(int qty, double price)
	{
		double amount = qty*price;
		return amount;
	}
	static double gstBill()
	{
		double amount = total(5,200);
		double gst6 = amount+(amount*0.06);
		return gst6;
	}
}