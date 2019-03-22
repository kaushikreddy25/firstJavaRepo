import java.io.IOException;
public class HelloWorld 
{
	
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

			System.out.println("Hello World!");
			System.err.println("Error message");
			
			System.out.println("Enter an alphabet");
			int i=System.in.read();	//returns ASCII code of 1st character  
			System.out.println((char)i);	//will print the character  
			
	}

}
