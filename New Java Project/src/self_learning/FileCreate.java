package self_learning;
import java.io.*;
import java.util.Formatter;


public class FileCreate 
{

	public static void main(String[] args) 
	{
		final Formatter c;
		
		try
		{
			c = new Formatter("CreatedFile.txt");
			System.out.println("You created a file");
		}
		catch(Exception e)
		{
			System.out.println("There is an error");
		}
		}
	}


