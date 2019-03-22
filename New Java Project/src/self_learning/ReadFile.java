package self_learning;
import java.util.*;
import java.io.*;
import java.lang.*;


public class ReadFile 
{
	public Scanner r;
	
	public void openFile()
	{
		try
		{	
			r = new Scanner(new File("WriteFile.txt"));
			System.out.println("Opened the file");
		}
		catch(Exception e)	
		{
			System.out.println("Couldn't open file");
		}			
	}
	
	public void readFile()
	{
		while(r.hasNext()) 
		{
			String a = r.next();
			String f = r.next();
			String l = r.next();
			
			System.out.printf("%s\t%s\t%s", a,f,l);
			System.out.println();
		}

	}
	
	public void closeFile()
	{
		r.close();
		
	}
	
	public static void main(String[] args) 
	{
		
		ReadFile rw = new ReadFile();
		rw.openFile();
		rw.readFile();
		rw.closeFile();


	}

}
