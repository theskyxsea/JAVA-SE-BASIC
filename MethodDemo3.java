class MethodDemo3
{
	public static void main(String[] args)
	{
		addition(100,20,30);
		substraction(500,20,90);
	}
	static void addition(double a, double b, double c)
	{
		double d = a+b+c ;
		System.out.println("Addition is "+ d);
	}
	static void substraction(double w, double x, double y)
	{
		double z = w-x-y ;
		System.out.println("Substraction is "+ z);
	}
}