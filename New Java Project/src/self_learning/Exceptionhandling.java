package self_learning;
import java.util.*;

public class Exceptionhandling 
{

	public static void main(String[] args) 
	{
		int x =1;
		do
			{
			try
			{Scanner input = new Scanner(System.in);
			
					int fnum, snum;
					double ans;
					System.out.println("Enter first number");
					fnum = input.nextInt();
					System.out.println("Enter second number");
					snum = input.nextInt();
					ans = fnum / snum;
					System.out.println(ans);
					x=2;
			}
			catch(Exception e) {
				System.out.println("You cant do that.Try again");
			}
			}while(x==1);
	}

}
