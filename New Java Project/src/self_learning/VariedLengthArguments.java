package self_learning;

public class VariedLengthArguments 
{

	public static void main(String[] args) 
	{

		System.out.println(average(1,2,3,4,5,6,1,2));
	}

		public static int average(int ...number)
		{
			
			int total=0;
			for(int x:number) //enhanced for loop
			{
				total+=x;
			}
			return total/number.length;
		}
}
