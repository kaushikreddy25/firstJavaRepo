// Constructor Overloading in single class
public class ConTest 
{

	int a,b;
	
	ConTest()
	{
		System.out.println("From Default Constructor");
		
		a=2;
		b=2;
		System.out.println("Value of a is "+ a);
		System.out.println("Value of b is "+ b);
	}
	
	ConTest(int a, int b)
	{
		System.out.println("From 1st Constructor(both integers)"); //using "this" keyword to eliminate use of local variables
		this.a = a;
		this.b = b;
		System.out.println("Value of a is "+ a);
		System.out.println("Value of b is "+ b);
	}
	// Java gives preference to formal parameters if name of FP and Data members are same so we use this() keyword to point to data members
	
	ConTest(int x)
	
	{
		System.out.println("From 2nd constructor(One integer only)");
		a = x;
		b = x;
		System.out.println("Value of a is "+ a);
		System.out.println("Value of b is "+ b);
	}
	
	ConTest(ConTest T)
	{
		System.out.println("From 3rd constructor(Object as argument)");
		a = T.a;
		b = T.b;
		System.out.println("Value of a is "+ a);
		System.out.println("Value of b is "+ b);
		
	}
	public static void main(String[] args)
	{
		ConTest T1 = new ConTest();
		ConTest T2 = new ConTest(5, 10);
		ConTest T3 = new ConTest(15);
		ConTest T4 = new ConTest(T1);
	}

	}
//Hence Proved that you don't need two different classes


