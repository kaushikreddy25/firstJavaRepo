package self_learning;
import java.io.*;  
import java.net.*;  

public class ClientDemo 
{  

	public static void main(String[] args) 
	{  
		try{      
//				No need to have object for ServerSocket because this is Client side
				Socket s=new Socket("localhost",6500);  
				
				PrintWriter dout=new PrintWriter(s.getOutputStream(),true);  
//				DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
				dout.write("Hello Server");
				
//				dout.flush();  
				dout.close();  
				s.close();  
			}
		catch(Exception e){System.out.println(e);}  
	}  
	  

}
