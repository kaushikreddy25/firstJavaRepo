package self_learning;		 //Simple calculator using if statements
import java.util.*;


public class SimpleCalc
{

	public static void main(String[] args) 
	{
	
		Scanner calc = new Scanner(System.in);
		double fnum, snum, ans;
		int op;
		System.out.println("Enter first number");
		fnum = calc.nextDouble();
		System.out.println("Enter second number");
		snum = calc.nextDouble();
		System.out.println("Enter required operation 1 for Addition, 2 for Subtraction, 3 for Multiplication, 4 for division" );
		op = calc.nextInt();
		if(op == 1) 
		{
		ans = fnum + snum;
		System.out.println(ans);
		}
		if(op == 2) 
		{
		ans = fnum - snum;
		System.out.println(ans);
		}
		if(op == 3) 
		{
		ans = fnum * snum;
		System.out.println(ans);
		}
		if(op == 4) 
		{
		ans = fnum / snum;
		System.out.println(ans);
		}
		
	}

}
