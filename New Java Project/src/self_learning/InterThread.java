package self_learning;

import java.util.Scanner;

public class InterThread 
{
	public void produce() throws InterruptedException
	{
		synchronized (this)
		{
			System.err.println("producer thread is running");
			wait();
			System.out.println("Resumed");
		}
	}

	public void consume() throws InterruptedException
	{
		Thread.sleep(1000);
		Scanner sc = new Scanner(System.in);
		synchronized (this)
		{
			System.out.println("Waiting for return key");
			sc.nextLine();
			System.out.println("Return key pressed");
			notify();
			Thread.sleep(2000);
		}
	}
}
