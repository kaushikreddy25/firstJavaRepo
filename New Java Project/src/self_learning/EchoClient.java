//From Java MasterClass example
package self_learning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoClient 
{

    public static void main(String[] args) throws UnknownHostException, IOException 
    {
        	Socket socket = new Socket("localhost", 5100); 
       
            BufferedReader echoes = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter stringToEcho = new PrintWriter(socket.getOutputStream(), true);

            Scanner scanner = new Scanner(System.in);
            String echoString;
            String response;

            do {
                System.out.println("Enter string to be echoed: ");
                echoString = scanner.nextLine();

                stringToEcho.println(echoString);
                if(!echoString.equals("exit")) 
	                {
	                    response = echoes.readLine();
	                    System.out.println(response);
	                }
            	} while(!echoString.equals("exit"));

        

        
    }
}
