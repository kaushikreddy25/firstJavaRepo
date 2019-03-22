package self_learning;
import java.util.*;

public class MultithreadingDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		/*Scanner input = new Scanner(System.in);
		System.out.println("Enter number of threads");
		int n = input.nextInt();
		Random rn = new Random();
		for (int i=1;i<=n;i++)*/
		{
			Thread t1 = new Thread(new Runnable() //anonymous class
					{
						public void run()
						{
							try 
							{
								System.out.println("Thread number with ID "+ Thread.currentThread().getId() + " is runnning- Thread A with Priority "+ Thread.currentThread().getPriority());
								//Thread.sleep(1);
							
							}
							catch(Exception e)
							{
								System.out.println("Exception caught");
							}
						}
					});
			Thread t2 = new Thread(new Runnable()
			{
				public void run()
				{
					try 
					{
						System.out.println("Thread number with ID "+ Thread.currentThread().getId() + " is runnning- Thread B & with Priority "+ Thread.currentThread().getPriority());
					//	Thread.sleep(1);
						

					}
					catch(Exception e)
					{
						System.out.println("Exception caught");
					}
				}
			});
			
			Thread t3 = new Thread(new Runnable()
			{
				public void run()
				{
					try 
					{
						System.out.println("Thread number with ID "+ Thread.currentThread().getId() + " is runnning- Thread C & with Priority "+ Thread.currentThread().getPriority());
					//	Thread.sleep(1);
						

					}
					catch(Exception e)
					{
						System.out.println("Exception caught");
					}
				}
			});
			
			
			
			
			/*Multithreading mu = new Multithreading();
			Multithreading1 mu1 = new Multithreading1();
			Multithreading2 mu2 = new Multithreading2();
			mu.setPriority(1);
			mu1.setPriority(5);
			mu2.setPriority(10);
			*/
			System.out.println("Trying to run threads in sequence of A>B>C");
			
			t1.start();
			t1.sleep(1000);
			
			t2.start();
			t2.sleep(1000);
			
			t3.start();
			t3.sleep(1000);
			
			//mu.start();
			//mu.sleep(1);
			/*try 
			{
				
				mu.sleep(2000);
				
			}
		
			catch(Exception e)
			{
				System.out.println("Exception caught");
			}*/
			
			/*mu1.start();
			mu.sleep(1);
			mu2.start();
			mu.sleep(1);
			//mu.suspend();
			*/
			//mu.stop(); 
			//mu.setPriority(1+rn.nextInt(10));
			
			//System.out.println("Priority is " + mu.getPriority());
			//System.out.println("Count is "+ Multithreading.activeCount());
			//System.out.println("Iteration "+ i + " is complete");
		}
		
	}

}
