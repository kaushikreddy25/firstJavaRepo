class Excep6
{  
	public static void main(String args[])
	{  
		try
		{  
			try
			{  
				System.out.println("going to divide");  
				int b =39/0; 
				System.out.println("Done dividing "+b);
			}
			catch(ArithmeticException e)
			{
				System.out.println("this catch block");
				System.out.println(e);
			} 
			finally //finally is compulsory if there is no catch block
			{
				System.out.println("this is finally");
			}
			try
			{  
				int a[]=new int[5];  
					a[5]=4;  
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
				
			}  
			
			System.out.println("other statement");  
		}
		catch(Exception e)
		{
			System.out.println("handeled");
		}  
  
		System.out.println("normal flow..");  
		
	}  
}  