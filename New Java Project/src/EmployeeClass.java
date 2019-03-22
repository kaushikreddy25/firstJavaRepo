import java.util.*;
public class EmployeeClass 
{
	static int empnum;
	static String name;
	static char cadre;
	static double basic, bonus, net;

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Num");
		int empnum = sc.nextInt();
		
		System.out.println("Enter Employee Name");
		String name = sc.next();
		
		System.out.println("Enter Employee Cadre - A, B or C");
		char cadre = sc.next().charAt(0);
		
		System.out.println("Enter Basic Salary");
		double basic = sc.nextDouble();

		if(cadre == 'A')
		{
			
			 bonus = basic *10/100;
			 net = bonus + basic;
			 
		}
		
		else if (cadre == 'B')
		{
			bonus = basic * 15/100;
			 net = bonus + basic;
		}
		else if (cadre == 'C')
		{
			bonus = basic * 20/100;
			 net = bonus + basic;
		}
		
		System.out.println("The Employee name is "+ name);
		System.out.println("The Employee Number is" + empnum);
		System.out.println("Cadre is "+ cadre);
		System.out.println("Basic Salary is " + basic);
		System.out.println("Bonus is"+ bonus);
		System.out.println("Net Salary is "+ net);
		
	}

}
