package self_learning;

public class AnimalPolyDemo 
{
	public static Animals[] list = new Animals[3];
	int i = 0;
	
	public void add(Animals a)
		{
						if(i<list.length) //to check if the array is full. After add() is called 5 times, 
							                   //bcoz of i++, i=5 then this if statement will be false
			{
						list[i]= a;
						//System.out.println("Animal added at index "+i);
						i++;
			}
		}

	public static void main(String[] args) 
	{
		
		
		Cat cobj = new Cat();
		Dog dobj = new Dog();
		Panda pobj = new Panda();
		
		AnimalPolyDemo ao = new AnimalPolyDemo();
		ao.add(cobj);
		ao.add(dobj);
		ao.add(pobj);
				
		for (Animals x: list)
		{
			x.action();
		}
	}

}
