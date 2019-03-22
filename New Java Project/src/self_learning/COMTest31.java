package self_learning;
//Ex 8.18 . creating class Account
public class COMTest31 
{
	 String name;
	 String acctype;
	 int accno;
	 static int bal;
	 
	 COMTest31(String n, String t, int a,int b)
		{
				name = n;
				acctype = t;
				accno = a;
				bal = b;
		}
	
	 public int depositMoney(int d)
	 {
		 System.out.println("Deposting amount "+ d);
			bal = bal + d;
			System.out.println("The current balance is: "+ bal);
		 return bal;
	 }
	 
	 public int balanceRet()
		{
			return bal;
		}
	 
	 public void withdraw(int w)
		{
			System.out.println("The current balance is: "+ bal);
			bal = bal- w;
			System.out.println("The balance after withdrawal is: "+ bal);
		}

}
