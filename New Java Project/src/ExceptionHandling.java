 public class ExceptionHandling
{
	public static void main(String []args)
	{
		int a=25;
		int b=0;
	    divide(a,b);
	}
		public static void divide(int a,int b)
		{
		   int res=0;
		     
		   try{
				  res=a/b;
			 }
			 catch(ArithmeticException e)
			 {
				  System.out.println(e);
				  System.out.println("dont divide by zero");
				  System.out.println(e.getMessage());
				  System.out.println("-------------------");
				  System.out.println(e.toString());
				  System.out.println("-------------------");
				  e.printStackTrace();
			 }
			 finally
			 {
				  System.out.println(" Exceptions are handled successfully");
			 }
		   
		 }
}
		