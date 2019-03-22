package self_learning;
import java.io.*;  
import java.net.*;  

public class ServerDemo 
{
	public static void main(String[] args)
	{  
		try
		{  
				ServerSocket ss=new ServerSocket(6500);  
				Socket s=ss.accept();//establishes connection   
				System.out.println("Client Connected");
				
				DataInputStream dis=new DataInputStream(s.getInputStream());  
				
				@SuppressWarnings("deprecation")
				String  str=dis.readLine();  
				System.out.println("Message from Client: "+str);  
				
				ss.close();  
		}
		catch(Exception e){System.out.println(e);}  
	}  
}  