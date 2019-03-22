package self_learning;
//Ex 8.2 Classes,Objects and Methods(COM)
public class COMTest1 
{
	String name = "Tom";
	
	public String getName() 
	{
		System.out.print("My Name is ");
		return name;
	}
	public static void main(String[] args)
	{
		System.out.print("Hello, ");
		COMTest1 nm= new COMTest1();
		System.out.printf(nm.getName());
	}

}
//add return statement to getName method