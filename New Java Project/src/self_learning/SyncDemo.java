package self_learning;

public class SyncDemo {

	public static void main(String[] args) throws Exception
	{
		Countermt c = new Countermt();
		//Countermt c1 = new Countermt();
		Thread t1 = new Thread(new Runnable() //anonymous class
				{
					public void run()
					{
						for (int i= 0; i<1000;i++ )
						{
							c.increment();
						}
					}
				});
		Thread t2 = new Thread(new Runnable()
				{
						public void run()
						{
							for (int i= 0; i<1000;i++ )
							{
								c.increment();
							}
						}
				});
			t1.start();
			t2.start();
			t1.join();
			t2.join();
			System.out.println("Count = " + c.count);
		//	System.out.println("Count1 = " + c1.count);
			
		}
}

