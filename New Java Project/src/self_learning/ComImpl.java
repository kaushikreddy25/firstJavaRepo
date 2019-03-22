package self_learning;

import java.util.Comparator;

public class ComImpl 	implements Comparator<Integer>
{

	@Override
	public int compare(Integer arg0, Integer arg1) 
	{
		if(arg0<arg1)
			return 1;
		return -1;
	}

}
