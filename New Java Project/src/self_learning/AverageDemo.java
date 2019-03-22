package self_learning;
import java.util.*;

public class AverageDemo 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		int number;
		int total= 0;
		int average;
		int counter= 0;
		
		while(counter <10)
		{
			number = sc.nextInt();
			total = total + number;
			counter++;
		}
		average = total/10;
		System.out.println("Average is "+ average);
		
		
	}

}
