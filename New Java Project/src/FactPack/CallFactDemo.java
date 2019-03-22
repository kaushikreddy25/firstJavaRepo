
package FactPack;
import java.util.Scanner;

public class CallFactDemo 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		Fact f = new Fact();
		int factAns = f.factorial(n);
		System.out.println("Factorial of given number is "+ factAns);

	}

}
