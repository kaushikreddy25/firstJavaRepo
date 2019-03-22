package self_learning;

public class ToStringDemo {

	public static void main(String[] args) 
	{
		ToString1 ts1 = new ToString1(25,11,1993);
		// System.out.println(ts1);
		ToString2 ts2 = new ToString2("Kaushik", ts1);
		
		System.out.println(ts2);
	}

}
//so essentially toString is used to send a string whenever an object is called