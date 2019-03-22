import java.io.*;

public class FileWriterChar 
{

	public static void main(String[] args) throws IOException 
	{
		
//		Writing file with a string
		
		try
		{
			File fo= new File("W:/Java/WritefileChar.txt");
			String s = "Writing using character stream classes";
			FileWriter fw = new FileWriter(fo);
			fw.write(s);
			fw.close();
		}	
		catch(Exception e) {}
		
//		Reading file and displaying on console
		
		File fi= new File("W:/Java/WritefileChar.txt");
		FileReader fr = new FileReader(fi);
	
		int ch;
		while ((ch=fr.read())!=-1)
		{
			System.out.print((char)ch);
		}
		fr.close();
		
//		Copying files
		
		File foc= new File("W:/Java/CopyFileChar.txt");
		FileWriter fwc = new FileWriter(foc);
		
		//need to creat new object for reader. can't use old object. why?
		File fi2= new File("W:/Java/WritefileChar.txt");
		FileReader fr2 = new FileReader(fi2);
		
		int chr;
		while ((chr=fr2.read())!=-1)
		{
			
			fwc.write(chr);
		}
		fr2.close();
		fwc.close();
	}

}
// String.valueOf doesn't work here in conversion from int to Character

// need to creat new reader object to copy files. can't use old reader object.