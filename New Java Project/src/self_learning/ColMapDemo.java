package self_learning;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ColMapDemo 
{

	public static void main(String[] args) 
	{
		Map<String,String> mp = new HashMap<>();
		
		mp.put("Name", "Kaushik");
		mp.put("Nationality", "Indian");
		mp.put("Club", "FC Barcelona");
		mp.put("Cricketer", "Dravid");
		
		mp.put("Club", "Arsenal"); //overwritten because map does 1v1 mapping
		
//		random output of elements
		System.out.println(mp);
		
//		Specific output of element based on key
		System.out.println(mp.get("Club"));
		
//		output of elements in order
		Set<String> keys = mp.keySet();
		for(String key:keys)
			System.out.println(key + "		"+ mp.get(key));
		
//		Another way to print HashMap is https://1drv.ms/u/s!Amv7MQc0JhpisWqR29E0B2osVtDP
	}

}
