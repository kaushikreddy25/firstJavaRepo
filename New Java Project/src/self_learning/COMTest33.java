package self_learning;
//Ex 8.18 . creating Savings Account

public class COMTest33 extends COMTest31
{
	COMTest33(String n, String t, int a, int b) 
	{
		super(n, t, a, b);
		// TODO Auto-generated constructor stub
	}

	int amount ;
	static int tyear=1;
	
	public void CompoundInterest()
	{
		for(int year=1; year<=tyear; year++)
	
	{	
			bal = (int) (bal*Math.pow(1 + .01, year));
			//bal = bal + amount;
			//System.out.println("for year "+ year + " Amount is "+ amount);
			
	}
		System.out.println("Balance after depositing interest is "+ bal);
	}
}
