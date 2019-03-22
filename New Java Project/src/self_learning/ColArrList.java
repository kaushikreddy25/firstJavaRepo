package self_learning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ColArrList 
{

	public static void main(String[] args) 
	{
		ArrayList<String> val = new ArrayList<>(); //can add elements in between
//		Collection val = new ArrayList(); - can't add elements in between using index because reference to object is Collection
		
		
		val.add("A");
		val.add("B");
		val.add("C");
		val.add("D");
		
		System.out.println("Size of collection after adding is "+ val.size());
		System.out.println("Contents are "+ val);
		val.add(2,"E");
		System.out.println("Changed collection by adding 'E' "+ val);
		val.remove("C");
		val.remove(0);
		val.remove(0);
		val.add(0,"Q");
		System.out.println("Changed collection by removing 'C', 1st object twice, \n adding 'Q' "+val);
		
//		To sort elements 
		
		Collections.sort(val);
		
		val.forEach(System.out::println);

		
//		To reverse elements
		
		Collections.reverse(val);
		
//		printing values using Steam API -> Lambda Expressions
		val.forEach(System.out::println);

		
//		printing values using enhanced for loop
		
//		for(Object s:val)
//		{
//			System.out.println(s);
//		}
	}

}

//0 index has 1st element