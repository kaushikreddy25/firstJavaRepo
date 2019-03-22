
public class ConstructorOverloader //Executive Logic Class
{

	public static void main(String[] args) 
	{
		ConstructorTest T1 = new ConstructorTest();
		ConstructorTest T2 = new ConstructorTest(5, 10);
		ConstructorTest T3 = new ConstructorTest(15);
		ConstructorTest T4 = new ConstructorTest(T1);
	}

}
