import java.util.Scanner;
class Ticket
{
	static int availableTicket = 60;
	void book(int countB)
	{
		if(countB<=availableTicket)
		{
			availableTicket=availableTicket-countB;
			System.out.println(countB + " TICKETS BOOKED.");
		}
		else
		{
			System.out.println("SORRY..! " +countB + " TICKETS NOT AVAILABLE..!");
		}
	}
	void cancel(int countC)
	{
		availableTicket=availableTicket+countC;
		System.out.println(countC + " TICKETS CANCELED.");
	}
	void showAvailable()
	{
		System.out.println(availableTicket + " TICKETS AVAILABLE.");
	}
}
class MainApp3
{
	public static void main(String [] args)
	{
		Scanner s1 = new Scanner(System.in);
		Operation o1 = new Operation();
		
		System.out.println("TICKET MENU");
		System.out.println("1. BOOK");
		System.out.println("2. CANCEL");
		System.out.println("3. SHOW AVAILABLE TICKETS");
		int choice = s1.nextInt();
		o1.choice(choice);
	}
}
class Operation
{
	Ticket t1 = new Ticket();
	Scanner s1 = new Scanner(System.in);
	
	void choice(int choice)
	{
		if (choice==1)
		{
			System.out.println("PLEASE ENTER NO OF TICKETS TO BOOK");
			int countB = s1.nextInt();
			t1.book(countB);
		}
		else if (choice==2)
		{
			System.out.println("PLEASE ENTER NO OF TICKETS TO CANCEL");
			int countC = s1.nextInt();
			t1.cancel(countC);
		}
		else if (choice==3)
		{
			t1.showAvailable();
		}
		else
		{
			System.out.println("INVALID CHOICE.");
		}
	}
}