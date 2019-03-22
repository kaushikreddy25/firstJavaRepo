package self_learning; //Program to generate dice roll using Random method
import java.util.*; // needs this import for Random

public class RandomNum 
{

	public static void main(String[] args) 
	{
		Random dice = new Random();
		int face;
		for(int i=1;i<=10;i++)
		{
			face = 1+dice.nextInt(6); //nextInt(6) will generate random values from 0 to 5 so we add one to make it 1 to 6 for dice
			System.out.println("Face value of " +i+ " roll is " + face);
		}

	}

}
