package self_learning;
//Exercise 13.4
public class ExceptionDebug3
{

	public static void main(String[] args) 
	{
		String n = args[0];
		String n1 = "Hello";
		if(n.equals(n1))
			System.out.println("String is right");
		else 
			try 
		{
				throw new MyException("Invalid string");
		}
		catch(MyException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
//String compare can't happen as args[0] == "Hello"
//Check Teststringcomparison3 program
