package self_learning; //Simple calculator using Switch statement
import java.util.*;


public class CalcSwitch 
{

	public static void main(String[] args) 
	{
		Scanner swit = new Scanner(System.in);
		double fnum, snum, ans;
		int op;
		System.out.println("Enter first number");
		fnum = swit.nextDouble();
		System.out.println("Enter second number");
		snum = swit.nextDouble();
		System.out.println("Enter required operation 1 for Addition, 2 for Subtraction, 3 for Multiplication, 4 for division" );
		op = swit.nextInt();
		switch (op)
		{
		case 1:
			ans = fnum + snum;
			System.out.println(ans);
			break;
		case 2:
			ans = fnum - snum;
			System.out.println(ans);
			break;
			
		case 3:
			ans = fnum * snum;
			System.out.println(ans);
			break;
			
		case 4:
			ans = fnum / snum;
			System.out.println(ans);
			break;
		default: 
			System.out.println("Wrong operation entered");
			break;
			
		}
	}

}
