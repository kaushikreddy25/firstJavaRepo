
public class ThisKey 
{
	int a , b;
	
	ThisKey()
	{
		this(10);
		
		a=1;
		b=2;
		System.out.println("Value of a is"+ a);
		System.out.println("Value of b is"+ b);
	}
	
	ThisKey(int x)
	{
		this(10,20);
		a=b=x;
		System.out.println("Value of a is"+ a);
		System.out.println("Value of b is"+ b);
		
	}
	
	ThisKey(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Value of a is"+ this.a);
		System.out.println("Value of b is"+ this.b);
		System.out.println("Value of a is"+ a);
		System.out.println("Value of b is"+ b);
	}
	
	public static void main(String[] args) 
	
	{
		ThisKey t1 = new ThisKey();
	}

}
