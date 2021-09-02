class DemoVeriable6
{
	public static void main (String[] args)
	{
		int x=30;
		int y=90;
		
		//using third variable
		int data=x;
		x=y;
		y=data;
		System.out.println(x+"\t"+y);
		
		//using arrithmatic approch
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x+"\t"+y);
				
	}
}