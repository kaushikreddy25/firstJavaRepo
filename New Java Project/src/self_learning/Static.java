package self_learning;

public class Static 
{

	private String firstName;
	private String lastName;
	private static int number;
	
	Static(String fname,String lname)
	{
		firstName = fname;
		lastName = lname;
		number++;
	
		System.out.println( "This is the constructor for" + firstName + lastName + "Number of members is "+ number  );
	}
}
