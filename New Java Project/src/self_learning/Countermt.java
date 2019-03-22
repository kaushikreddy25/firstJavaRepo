package self_learning;

public class Countermt 
{
	int count;
	public synchronized void increment()
	{
		count++;
	}
}
