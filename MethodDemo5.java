class MethodDemo5
{
	public static void main(String[] args)
	{
		areaCircle(24.5);
		areaTriangle(10,20);
		areaSquare(20);
		areaRectangle(40,60);
	}
	static void areaCircle(double rad)
	{
		double areaC = 3.14*rad*rad;
		System.out.println("Area of Circle is "+ areaC );
	}
	
	static void areaTriangle(double base , double height)
	{
		double areaTri = base*height;
		System.out.println("Area of Triangle is "+ areaTri);
	}
	
	static void areaSquare(double side)
	{
		double areaSqr = side*side;
		System.out.println("Area of Square is "+ areaSqr);
	}
	static void areaRectangle (double length , double width)
	{
		double areaRect = length*width;
		System.out.println("Area of Rectangle is "+areaRect);
	}
}