import java.util.Scanner;

class Atm
{
	static double accountBalance = 5555.99;
	static Scanner sc1 = new Scanner(System.in);
	static int pin;
	
	static
	{
		System.out.println("Select Language");
		System.out.println("1: English");
		System.out.println("2: Hindi");
		System.out.println("3: Marathi");
		int language = sc1.nextInt();
		if(language==1)
		{
			System.out.println("Thank you for Selecting English");
		}
		else if(language==2)
		{
			System.out.println("Hindi chunneke liye Shukriya");
		}
		else if(language==3)
		{
			System.out.println("Marathi nivadlyabaddal Dhanyavad");
		}
		else
		{
			System.out.println("Invalid Choice");
			System.exit(0);
		}
	}
	
	static
	{
		System.out.println("please Enter PIN");
		pin = sc1.nextInt();
	}
	
	public static void main(String [] args)
	{
		if (pin==4523)
		{
			System.out.println("Select Operation");
			System.out.println("1: Withdraw");
			System.out.println("2: Balance Check");
			int choice = sc1.nextInt();
			if (choice==1)
			{
				System.out.println("Enter Amount to Withdraw");
				double amt = sc1.nextDouble();
				withdraw(amt);
			}
			else if (choice==2)
			{
				balanceCheck();
			}
			else 
			{
				System.out.println("Invalid Choice");
			}
		}
		else
		{
			System.out.println("Invalid PIN");
		}
	}
	static void withdraw(double amt)
	{
		if (accountBalance>=amt)
		{
			accountBalance-=amt;
			System.out.println(amt+" Rs debited from account");
			balanceCheck();
		}
		else
		{
			System.out.println("Insufficient Funds");
		}
	}
	static void balanceCheck()
	{
		System.out.println("Your account balance is "+ accountBalance);
	}
}