class GoogleAccount
{
	static int count = 0;
	{
		System.out.println("Account Created Successfully");
		profile();
		count++;
	}
	void profile()
	{
		System.out.println("Profile Created Successfully");
	}
}
class MainApp3
{
	public static void main(String [] args)
	{
		GoogleAccount g1 = new GoogleAccount();
		GoogleAccount g2 = new GoogleAccount();
		GoogleAccount g3 = new GoogleAccount();
		System.out.println("Total accounts Created is "+GoogleAccount.count);
	}
}