package self_learning;

public class Multithreading2 extends Thread // instead of extends can use - implements runnable- too 
{	
	public void run()
	{
		try 
		{
			System.out.println("Thread number with ID "+ Thread.currentThread().getId() + " is runnning- Thread C & with Priority "+Thread.currentThread().getPriority());
			//Thread.sleep(1);
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
	}
}
