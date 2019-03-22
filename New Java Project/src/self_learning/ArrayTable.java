//program to read numbers into an array, display the array and sum of array elements
package self_learning;
import java.util.*;

public class ArrayTable 
{

	public static void main(String[] args) 
	
	{
		 Scanner sc =new Scanner(System.in);

	        System.out.println("enter number of elements");	//need to know length first to use for loop for accepting elements of array

	        int n=sc.nextInt();

	        int arr[]=new int[n];

	        System.out.println("enter elements");

	        for(int i=0;i<n;i++)
	        {									//for reading array
	            arr[i]=sc.nextInt();

	        }
	        System.out.println("Index\tValue");
	        for(int i=0;i<n;i++)									      //for(int x: arr) if using enhanced for loop
	        { 									//for printing array

	            System.out.println(i+ "\t"+ arr[i]);

	        }
	        int sum=0;
	        for(int i=0;i<n;i++)
	        {
	        	sum+=arr[i];
	        }
	        System.out.println("The sum of these numbers is "+ sum);
	}

}
