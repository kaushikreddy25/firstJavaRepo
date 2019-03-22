import java.util.*;
public class ScannerDemo2
{

	public static void main(String[] args) 
	
	{
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input format of EmployeeNumber Name Salary Mobile Number");
		String input = sc.nextLine();
		
		Scanner sc1 = new Scanner(input).useDelimiter("\\s");
		
		System.out.println("Employee Number is "+ sc1.nextInt());
		System.out.println("Name is "+ sc1.next());
		System.out.println("Salary is "+ sc1.nextInt());
		System.out.println("Mobile Number is "+ sc1.nextLong());
		sc1.close();
		
	}

}
