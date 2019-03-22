package self_learning;
//Ex 8.18 . creating Current Account

public class COMTest32 extends COMTest31 
{
	COMTest32(String n, String t, int a, int b) {
		super(n, t, a, b);
		// TODO Auto-generated constructor stub
	}

	public void balanceCheck()
	{
		if(bal<10000)
			{
				System.out.println("Low balance penalty will be deducted");
				bal = (int) (bal - 0.15*bal);
				System.out.println("Balance after penalty is "+ bal);
			}
		else
			System.out.println("No penalty. Balance is "+ bal);
	}
}
