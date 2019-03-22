package self_learning;
import java.util.*;


public class COMTest3Demo 
{

	public static void main(String[] args) 
	{
		int x=1; //for do-while loop
		int z=1; 
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter Account Number");
		int accno = sc.nextInt();
		System.out.println("Enter Balance");
		int bal = sc.nextInt();
	do {
		System.out.println("Enter Account Type\nCA for Current Account\nSB for Savings Account");
		String acctype = sc.next();
		
		
		
		String t1= "SB";
		String t2= "CA";
		String y= "Y";
		String n = "N";
		
		//COMTest31 bank= new COMTest31(name, acctype, accno, bal);
		/*
		System.out.println("Do you want to Deposit? Y/N");
		String de = sc.next();
		if(de.equals(y))
		{
		System.out.println("Enter deposit amount");
		int dep = sc.nextInt();
		bank.depositMoney(dep);
		}
		System.out.println("Do you want to Withdraw? Y/N");
		String wi = sc.next();
		if(wi.equals(y))
		{
		System.out.println("Enter withdraw amount that is less than your balance");
		int wit = sc.nextInt();
		
		if(wit < bank.balanceRet())
			
			bank.withdraw(wit);
		else
			System.out.println("Enter valid withdrawal amount");
		
		System.out.println("Balance is "+ bank.balanceRet());
		}
		*/
		
		if(acctype.equals(t1))
		{
			z=2;
			COMTest33 sba = new COMTest33(name, acctype, accno, bal);
			//sba.CompoundInterest();
			
			System.out.println("Do you want to Deposit? Y/N");
			String de = sc.next();
			
			if(de.equals(y))
				{
					System.out.println("Enter deposit amount");
					int dep = sc.nextInt();
					sba.depositMoney(dep);
				}
			else
				{
					System.out.println("No deposit");
				}
			
			System.out.println("Do you want to Withdraw? Y/N");
			String wi = sc.next();
			
			if(wi.equals(y))
				{
				do
				{
				
					System.out.println("Enter withdraw amount that is less than your balance");
					int wit = sc.nextInt();
					
					
						if(wit < sba.balanceRet())
						
						
							{
								sba.withdraw(wit);
								x=2;
							}
						else
							{
								try
									{
										throw new MyException("Enter Valid amount");
									}
								catch(MyException e)
									{
										System.out.println(e.getMessage());
									}
							}
				}while(x==1);
		}
			
			else
				{
					System.out.println("No withdrawal");
				}
					
			System.out.println("Balance is "+ sba.balanceRet());
			
			System.out.println("Calculating Interest and depositing it into your account");
			sba.CompoundInterest();
		}
			
		else if(acctype.equals(t2))
		{
			System.out.println("Info: Interest facility only for Savings account");
			z=2;
			COMTest32 caa = new COMTest32(name, acctype, accno, bal);
			
			System.out.println("Do you want to Deposit? Y/N");
			String de2 = sc.next();
			if(de2.equals(y))
					{
						System.out.println("Enter deposit amount");
						int dep = sc.nextInt();
						caa.depositMoney(dep);
					}
			System.out.println("Do you want to Withdraw? Y/N");
			String wi2 = sc.next();
			
			if(wi2.equals(y))
			{
				do
				{
				
					System.out.println("Enter withdraw amount that is less than your balance");
					int wit = sc.nextInt();
					
					
						if(wit < caa.balanceRet())
						
						
							{
								caa.withdraw(wit);
								x=2;
							}
						else
							{
								try
									{
										throw new MyException("Enter Valid amount");
									}
								catch(MyException e)
									{
										System.out.println(e.getMessage());
									}
							}
				}while(x==1);
			}
			System.out.println("Balance is "+ caa.balanceRet());
			
			caa.balanceCheck();
		}
			else
				System.out.println("Give valid account type");
		
	}	while(z==1);	
}
}
	
