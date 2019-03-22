//Average of numbers using for loop

package self_learning;
import java.util.*;

public class AverageDemoFor 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		int number;
		int total= 0;
		int average;
		int counter;		
		for(counter= 1; counter <=10; counter ++)
		{
			number = sc.nextInt();
			total = total + number;
			
		}
		average = total/10;
		System.out.println("Average is "+ average);
		
		
	}

}
