package self_learning;
import java.util.*;

public class TimeDisplayDemo 
{

	public static void main(String[] args)
	{
		int h,m,s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hour");
		h =sc.nextInt();
		System.out.println("Enter minute");
		m =sc.nextInt();
		System.out.println("Enter seconds");
		s =sc.nextInt();
		
		TimeDisplay td = new TimeDisplay();
		TimeDisplay td2 = new TimeDisplay(h);
		TimeDisplay td3 = new TimeDisplay(h,m);
		TimeDisplay td4 = new TimeDisplay(h,m,s);
		
		/*System.out.printf("%s\n", td.toRailway()); //alternate way of printing because torailway() method has return
		System.out.println(td2.toRailway());
		System.out.println(td3.toRailway());
		System.out.println(td4.toRailway());*/
		//if alternate is used in TimeDisplay program then use this
		
		td.toRailway();
		td2.toRailway();
		td3.toRailway();
		td4.toRailway();
	}

}
