package self_learning;

public class ExceptionDebug1 
{

	public static void main(String[] args) 
	{
		try
		{
			int n=Integer.parseInt(args[0]);
			int n1=Integer.parseInt(args[1]);
			int n2 = n + n1;
			System.out.println(n2);		
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Arit Exception block 1");
		}
		//need to remove below code to debug as two same catch blocks are unnecessary
		/*catch(ArithmeticException ex)
		{									
			System.out.println("Arit Exception block 2");
		}*/
		catch(NumberFormatException ex)
		{
			System.out.println("Number format check"+ ex.getMessage());
		
		}
		catch(Exception ex)
		{
			System.out.println("Exception"+ex);
		}
	}

}
