import java.util.*;
public class ExceptionHandling1
{
	public static void main(String []args)
	{
		String s1,s2;
		
		try{
			System.err.println("Enter 2 numbers");
			Scanner sc = new Scanner(System.in);
			s1 = sc.next();
			s2 = sc.next();
			 
			 int n1=Integer.parseInt(s1);
			 int n2=Integer.parseInt(s2);
			 
			 int n3=n1/n2;
			 System.out.println("Quotient is "+n3);
			 
		}
		catch(ArithmeticException e)
		{
			 System.out.println("Do not put zero for Denominator");
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("Parameters must be Integers only");
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("Input Two values only");
		}
		catch(NullPointerException npe)
		{
		    System.out.println(" Should not be null ");
		}
		finally
		{
			System.out.println(" End of the program");
		}
	}
}
			 
		