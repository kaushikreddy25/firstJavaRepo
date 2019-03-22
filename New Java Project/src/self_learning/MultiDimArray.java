package self_learning;

public class MultiDimArray 
{

	public static void main(String[] args) 
	{
		int FirstArray[][] = {{3,4,5},{6,7,8},{1,1,1,2}};
		int SecondArray[][] = {{1,2},{5,5,6,7},{12,15}};
		
		display(FirstArray);
		System.out.println();
		display(SecondArray);
		
	}
	public static void display(int x[][])
	{
		for(int row=0;row<x.length;row++)
			{
			for(int col=0;col<x[row].length;col++) //means length of ??
			{
			System.out.print(x[row][col]+ "\t");
			}
			System.out.println();
			}
	
	}
}
