class Demo
{
	static int p = 20;
	{
		System.out.println("Demo Block");
	}
}
class MainApp2
{
	public static void main(String[] args)
	{
		{
			System.out.println("Main Method Block");
		}
		
		Demo d1 = new Demo();
		System.out.println("Main Method");
	
		System.out.println("value of p is "+ Demo.p);
	}
}