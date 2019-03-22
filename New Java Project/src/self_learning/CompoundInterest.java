package self_learning;
import java.util.*;

public class CompoundInterest 
{

	public static void main(String[] args)
	{
		double amount;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal Amount");
		int principal = sc.nextInt();
		System.out.println("Enter Rate of interest");
		double rate = sc.nextDouble();
		System.out.println("Enter Number of years");
		int tyear = sc.nextInt();
		
		for(int year=1; year<=tyear; year++)
		{	
			amount = principal*Math.pow(1 + rate, year);
			System.out.println("for year "+ year + " Amount is "+ amount);
				
		}
	}

}
