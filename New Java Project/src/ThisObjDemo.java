import java.util.*;
public class ThisObjDemo 
{

	public static void main(String[] args) 
	{
		
		Scanner key = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int e = key.nextInt();
		System.out.println("Enter 2nd Number");
		int f = key.nextInt();
		System.out.println("Enter 3rd Number");
		int g = key.nextInt();
		System.out.println("Enter 4th Number");
		int h = key.nextInt();
		
		ThisObj t1 = new ThisObj(e,f);
		ThisObj t2 = new ThisObj(g,h);
		ThisObj t3 = new ThisObj();
		
		t3 = t1.Sum(t2);
		
		System.out.println("t1 values are");
		t1.display();
		System.out.println("t2 values are");
		t2.display();
		System.out.println("t3 values are");
		t3.display();
		
		
	}

}
