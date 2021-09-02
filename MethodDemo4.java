class MethodDemo4
{
	public static void main(String[] args)
	{
		minsToSec(40);
		secToMins(460);
	}
	static void minsToSec(double M)
	{
		double Ms = M * 60;
		System.out.println("Conversion of "+M +" mins to secs is "+Ms+" Secs.");
	}
	static void secToMins(double S)
	{
		double Sm = S / 60;
		System.out.println("Conversion of "+S +" Secs to Min is "+Sm+" Mins.");
	}
}