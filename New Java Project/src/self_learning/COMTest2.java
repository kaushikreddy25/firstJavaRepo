package self_learning;
import java.util.*;
public class COMTest2 
//Ex 8.16 8.17
{

	String name;
	String acctype;
	int accno;
	static int bal;
	
	COMTest2(String n, String t, int a,int b)
	{
			name = n;
			acctype = t;
			accno = a;
			bal = b;
	}
	
	public void deposit(int d)
	{
		System.out.println("Deposting amount "+ d);
		bal = bal + d;
		System.out.println("The current balance is: "+ bal);
	}
	public void withdraw(int w)
	{
		System.out.println("The current balance is: "+ bal);
		bal = bal- w;
		System.out.println("The balance after withdrawal is: "+ bal);
	}
	public int balanceRet()
	{
		return bal;
	}
	public void display()
	{
		System.out.println("Name is "+name +" Balance is "+ bal);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter Account Number");
		int accno = sc.nextInt();
		System.out.println("Enter Account Type");
		String acctype = sc.next();
		System.out.println("Enter Balance");
		int bal = sc.nextInt();

		COMTest2 bank= new COMTest2(name, acctype, accno, bal);
		//bank.assignVal(name, acctype, accno, bal);
		System.out.println("Enter deposit amount");
		int dep = sc.nextInt();
		bank.deposit(dep);
		System.out.println("Enter withdraw amount that is less than your balance");
		int wit = sc.nextInt();
		if(wit < bank.balanceRet())
			
			bank.withdraw(wit);
		else
			System.out.println("Enter valid withdrawal amount");
		bank.display();
		
	
	}

}
