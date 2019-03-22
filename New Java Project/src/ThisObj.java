
public class ThisObj 
{
	int a,b;
	
	ThisObj()
	{
		a=b=0;
		
	}
	ThisObj(int a, int b)
	{
		this.a=a;
		this.b=b;
		
	}
	
		ThisObj Sum(ThisObj T)
		{
			ThisObj T10 = new ThisObj();
			
			T10.a = this.a + T.a;
			T10.b = this.b + T.b;
			return(T10);
		}
		void display()
		{
			System.out.println("Value of A is"+ a);
			System.out.println("Value of B is"+ b);
		}
}
