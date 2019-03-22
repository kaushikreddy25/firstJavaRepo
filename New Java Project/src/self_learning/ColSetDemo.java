package self_learning;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ColSetDemo 
{

	public static void main(String[] args) 
	{
		Set<Integer> se = new HashSet<>();
		
		System.out.println(se.add(86333));
		System.out.println(se.add(36398));
		System.out.println(se.add(56598));
		System.out.println(se.add(86333));
		System.out.println(se.add(18794));
		System.out.println(se.add(97234));
		
		for(int i:se)
			System.out.println(i);
		
		System.out.println("--------------------");
		
//		TreeSet sort the elements
		
		Set<Integer> set = new TreeSet<>();
		
		System.out.println(set.add(86333));
		System.out.println(set.add(36398));
		System.out.println(set.add(56598));
		System.out.println(set.add(86333));
		System.out.println(set.add(18794));
		System.out.println(set.add(97234));
		
		for(int j:set)
			System.out.println(j);
		
		
	}

}
