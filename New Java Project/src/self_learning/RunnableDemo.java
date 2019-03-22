package self_learning;

public class RunnableDemo 
{

	public static void main(String[] args) 
	{
			Runnable obj = new Runnable()
					{	
					public void run() 
						{
							for(int i=1;i<=10;i++)
							{
								System.out.println("SubThread: " + i);
							}
							System.out.println("End of SubThread");
						}
					};
			Thread tobj =new Thread(obj);
			tobj.start();
			
			//new Thread(new Runnablemt()).start();
			System.out.println("End of main thread");
	}

}
