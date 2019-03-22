package self_learning;

public class JoinDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Runnable obj = new Runnable()
				{
						public void run()
						{
							for(int i=1;i<=4;i++)
								{
								System.out.println("Hi");
								try 
									{
										Thread.sleep(1000);
									} catch (InterruptedException e) 
									{
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
						}
					
				};
		Runnable obj1 = new Runnable()
				{
						public void run()
						{
							for(int i=1;i<=4;i++)
							{
								System.out.println("Hello");
								try 
									{
										Thread.sleep(1000);
									} catch (InterruptedException e) 
									{
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
							}
						}
				};
		Thread t1 = new Thread(obj,"Hi Thread");
		Thread t2 = new Thread(obj1, "Hello Thread");
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());

		
		t1.start();
		try 
		{
			Thread.sleep(10);
		} catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Bye");
	}

}
