package self_learning;
//Ex 8.5 COM debugging exercise
public class COMTest4 
{
		
		public String draw(String s)
		{
			return "String method";
			
		}
		
		//public void draw(String s) {};
		
		public String draw(double d) 
		{
			System.out.println();
			return "double method";
		
		};
		
		
	public static void main(String[] args) 
	{
		double d = 0;
		COMTest4 cm= new COMTest4();
		cm.draw(d);
		
	}

}
//can't have two methods with same name. return type isn't part of method signature.
// don't write date type in return statement.