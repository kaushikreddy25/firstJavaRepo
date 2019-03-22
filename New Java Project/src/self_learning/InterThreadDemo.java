package self_learning;
import java.util.Scanner;

public class InterThreadDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		final InterThread it = new InterThread();
		Thread t1 =new Thread(new Runnable()
				{
					public void run()
					{
						try { it.produce(); } catch(Exception e) {}
								
								
					}
				});
		Thread t2 = new Thread(new Runnable()
				{			
	
			public void run()
			{
				try { it.consume(); } catch(Exception e) {}
						
						
			}
		
				});	
				
	t1.start();
	t2.start();
	t1.join();
	t2.join();
		
	}

}
