package self_learning;
//Exercise 13.3 Balagurusamy

public class ExceptionDebug2 
{

	public static void main(String[] args)
	{
		if (args[0]=="Hello")
			System.out.println("String is right");
		else 
			try
		{
				throw //new ArithmeticException();
				new Exception("Invalid String");
		}
		catch(Exception e)
		{
			System.out.println("Handled: "+ e.getMessage());
		}
		finally
		{
			System.out.println("Finally statement");
		}
		}
	}

//added try and catch statement


//throw statement should always be in try block
//if user defined exception is thrown then catch is compulsory . else only finally is enough
//throw has to always be followed by word "new" for all kinds of exceptions 
