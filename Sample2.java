class Sample2
{
	public static void main(String [] args)
	{
		int a = 20;
		int b = 10;
		int c = (a+b);
		
		b = (a++)+a+(++a)+(a--);
		
		if(((a++>12|b--<100)&&(a-->12))&((++a>5)&(c++>8)))
		{
			a--;
			b++;
			c++;
		}
		else
		{
			a++;
			b--;
			c--;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}