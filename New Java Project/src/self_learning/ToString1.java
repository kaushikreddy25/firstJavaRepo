package self_learning;
/* using this keyword to reference current class object so when 'this' is used then it calls object and toString is used to 
represent an object as a string. so automatically string from toString method goes to object and is called by this.*/

public class ToString1 
{
	private int month;
	private int day;
	private int year;
	
	ToString1(int d, int m, int y)
	{
		month = m;
		day = d;
		year = y;
		System.out.printf("Inside ToString1 constructor %s", this);
	}
	
	public String toString()
	{
		 return String.format("\n%d/%d/%d",day,month,year);
	}
	
}
