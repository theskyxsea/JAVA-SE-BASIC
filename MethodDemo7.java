class MethodDemo7
{
	public static void main(String[] args)
	{
		double output = areaCircle();
		System.out.println("Area of Circle is "+output);
	}
	static double areaCircle()
	{
		double rad = addition(2,8);
		double areaC = 3.14*rad*rad;
		return areaC;
	}
	static double addition(double a , double b)
	{
		double add = a + b;
		return add;
	}
}