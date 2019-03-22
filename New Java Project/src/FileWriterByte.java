import java.io.*;
public class FileWriterByte 
{

	public static void main(String[] args) throws IOException 
	{
//		writing byte array to a file
		
		try
		{
			byte cities[] = {'D','E','L','H','I','\r','\n','M','Y','S','U','R','U','\r','\n','L','O','N','D','O','N'};
			
			FileOutputStream fouts= new FileOutputStream("W:/Java/ReadWritefileByte.txt");
			String s = "\n Starting to write City names \n";
			byte b[]= s.getBytes(); //to note
			fouts.write(100);
			fouts.write(45); //will convert integers to chars using ASCII
			fouts.write(b);
			fouts.write(cities);
			fouts.close();
			System.out.println("Succesfully written");
		}	
		catch(Exception e) {}
			
//		reading from file and printing on console
		
		FileInputStream fins= new FileInputStream("W:/Java/ReadWritefileByte.txt");
		int b;
		
		while ((b=fins.read())!=-1)
		{
			System.out.print((char)b);
		}
		fins.close();
		
		
	}

}
