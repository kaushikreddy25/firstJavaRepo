//using arrays in methods
package self_learning;

public class ArrayMethod
{

	public static void main(String[] args)
	{
		int arr[]= {2,4,6,8,10};
		System.out.println("Unchanged Elements are");
		for(int x:arr)
			System.out.println(x);
		change(arr);						//can even write ArrayMethod.change(arr); but same class so can call method directly
		System.out.println("Changed Elements are");
		for(int x:arr)
			System.out.println(x);
	}
	
	public static void change(int a[]) 
	{
		for(int j=0;j<a.length;j++)
			a[j]+=1;
	}
}

