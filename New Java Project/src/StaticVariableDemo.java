
public class StaticVariableDemo 
{
	void display1()
	{
		System.out.println("Display1 instance");
	}
	
	static void display2()
	{
		System.out.println("Display2 instance");
	}	
	
	public static void main(String[] args) 
	{
		
			System.out.println("Main beginning!");
			
			StaticVariableDemo so = new StaticVariableDemo();
			
			so.display1(); 
			StaticVariableDemo.display2();
			
			System.out.println("Main end");
			
	}

}
