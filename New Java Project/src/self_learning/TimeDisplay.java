package self_learning;

public class TimeDisplay 
{
	private int hour;
	private int minute;
	private int second;
	
	TimeDisplay()
	{
		this(0,0,0);
	}
	TimeDisplay(int h)
	{
		this(h,0,0);
	}
	TimeDisplay(int h,int m)
	{
		this(h,m,0);
	}
	TimeDisplay(int h,int m,int s)
	{
		setTime(h,m,s);
	}
	
	public void setTime(int h,int m, int s) 
	{
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	
	public void setHour(int h)
	{
		hour = ((h>=0 && h<24)?h :0); //alternative to if statement using conditional operators
	}
	public void setMinute(int m)
	{
		minute = ((m>=0 && m<60)?m :0); // if conditions in brackets are satisfied then minute = m else 0
	}
	public void setSecond(int s)
	{
		second = ((s>=0 && s<60)?s :0);
	}
	public int getHour()
	{
		return hour;
	}
	public int getMinute()
	{
		return minute;
	}
	public int getSecond()
	{
		return second;
	}
	
	public void toRailway() {
		System.out.println(hour +":" + minute + ":" + second); //cant use methods in println function. gotta use variables only. methods can be called using objects or classname only
	}
	
	/*public String toRailway()
	{
		return String.format("%02d:%02d:%02d", getHour(),getMinute(),getSecond());
	}*/
	//this is alternate toRailway
}
