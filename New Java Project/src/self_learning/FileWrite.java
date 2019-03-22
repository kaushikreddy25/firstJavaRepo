package self_learning;
import java.io.*;
import java.lang.*;
import java.util.*;

public class FileWrite 
{
	private Formatter x;
	public void openFile()
	{
		try
		{
			x = new Formatter("WriteFile.txt");
			System.out.println("You created a file");
		}
		catch(Exception e)
		{
			System.out.println("There is an error");
		}
	}
		public void writeFile()
		{
			x.format("%s%s%s", "25\t", "Kaushik\t", "Reddy");

		}
		
		public void closeFile()
		{
			x.close();
			
		}
	public static void main(String[] args) 
	{
			
		FileWrite fw = new FileWrite();
		fw.openFile();
		fw.writeFile();
		fw.closeFile();

	}

}
