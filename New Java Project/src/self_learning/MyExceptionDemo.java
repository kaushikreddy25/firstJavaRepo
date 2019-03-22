package self_learning;

public class MyExceptionDemo 
{

	public static void main(String[] args) 
	{
		try {
			
			throw new MyException("user defined exception");
		}
		catch(MyException e)
		{
			System.out.println("Caught");
			System.out.println(e.getMessage());
		}
	}
}


