class MethodDemo1
{
	public static void main (String[] args)
	{
		System.out.println("Main Method");
		externalMethod();
		externalMethod();
	}
	static void externalMethod()
	{
		System.out.println("Extrnal Method");
	}
}