package self_learning; //using arrays as counters
import java.util.*;

public class DiceFreq 
{

	public static void main(String[] args) 
	{
		Random dice = new Random();
		int freq[]= new int[7];
		for (int i=1;i<100;i++)
		{
			++freq[1+dice.nextInt(6)]; //increases the value of the element in freq[] array in the index generated by random
		}
		
		System.out.println("Face Value\tFrequency");
		for(int j=1;j<freq.length;j++)
		{
			System.out.println(j + "\t\t"+ freq[j]);
		}
	}

}
