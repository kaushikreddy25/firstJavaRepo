package self_learning;
import java.util.*;
public class SimpleAdd 
{

	public static void main(String[] args) 
	{
		Scanner add = new Scanner(System.in);
		double fnum, snum, ans;
		System.out.println("Enter first number");
		fnum = add.nextDouble();
		System.out.println("Enter second number");
		snum = add.nextDouble();
		ans = fnum + snum;
		System.out.println(ans);
	}

}
