package self_learning;

public class ToString2 
{
	private String name;
	private ToString1 birthday;
	
	public ToString2(String theName, ToString1 theDate) 
	{
		name = theName;
		birthday = theDate;
	}
	public String toString()
	{
		return String.format("\nBirthday of %s is on %s", name, birthday);
	}
}
