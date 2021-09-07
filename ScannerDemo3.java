import java.util.Scanner;

class ScannerDemo3
{
	public static void main(String[] args)
	{
		Scanner ak = new Scanner (System.in);
		System.out.println("Enter Total no of WINS ");
		int win = ak.nextInt();
		System.out.println("Enter Total no of LOSSES ");
		int loss = ak.nextInt();
		System.out.println("Enter Total no of DRAWS ");
		int draw = ak.nextInt();
		int output = rewardCalc(win,loss,draw);
		System.out.println("Reward Points = "+output);
	}
	static int rewardCalc(int win,int loss, int draw)
	{
		int reward = (25*win)-(10*loss)+(10*draw);
		return reward;
	}
}