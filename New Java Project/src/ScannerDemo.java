import java.util.Scanner;
public class ScannerDemo
{

	public static void main(String[] args) 
	
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input a name");
		String name = sc.nextLine();
		
		System.out.println("Input Gender");
		char gender = sc.next().charAt(0);
		
		System.out.println("Input Age");
		int age = sc.nextInt();
		
		System.out.println("Input Mobile Number");
		long mobileno = sc.nextLong();
		
		System.out.println("Name is "+ name);
		System.out.println("Gender is "+ gender);
		System.out.println("Age is "+ age);
		System.out.println("Mobile Number is "+ mobileno);
		sc.close();
		
	}

}
