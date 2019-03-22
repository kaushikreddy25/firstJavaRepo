package self_learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ColCompare 
{

	public static void main(String[] args) 
	{
//		Another way of adding values. Double Brace Initialization
		
		ArrayList<Integer> v = new ArrayList<Integer>() 
		{{
			add(4327);
			add(8203);
		}};
		v.add(1234);
		v.add(9345);
		v.add(7643);
		v.add(3864);
		
//		Using anonymous class n Lambda expressions. see ComImpl.java
		Comparator<Integer> com = (Integer arg0, Integer arg1) ->
		{
				if(arg0<arg1)
					return 1;
				return -1;
			};
		
		Collections.sort(v, com);
		
		v.forEach(System.out::println);
		
		
	}

}
