public class ConstructorTest  //Business Logic Class
{

	int a,b;
	
	ConstructorTest()
	{
		System.out.println("From Default Constructor");
		
		a=2;
		b=2;
		System.out.println("Value of a is "+ a);
		System.out.println("Value of b is "+ b);
	}
	
	ConstructorTest(int x, int y)
	{
		System.out.println("From 1st Constructor(both integers)");
		a = x;
		b = y;
		System.out.println("Value of a is "+ a);
		System.out.println("Value of b is "+ b);
	}
	
	ConstructorTest(int x)
	
	{
		System.out.println("From 2nd constructor(One integer only)");
		a = x;
		b = x;
		System.out.println("Value of a is "+ a);
		System.out.println("Value of b is "+ b);
	}
	
	ConstructorTest(ConstructorTest T)
	{
		System.out.println("From 3rd constructor(Object as argument)");
		a = T.a;
		b = T.b;
		System.out.println("Value of a is "+ a);
		System.out.println("Value of b is "+ b);
		
	}
}
