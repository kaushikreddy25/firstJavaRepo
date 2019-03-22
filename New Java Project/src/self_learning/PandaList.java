package self_learning;

public class PandaList 
{
	Panda[] pandalist = new Panda[5];
	int i = 0;
	
	void add(Panda p)
		{
						if(i<pandalist.length) //to check if the array is full. After add() is called 5 times, 
							                   //bcoz of i++, i=5 then this if statement will be false
			{
						pandalist[i]= p;
						System.out.println("Panda added at index "+i);
						i++;
			}
		}
	}
