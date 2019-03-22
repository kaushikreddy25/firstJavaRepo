package self_learning;

//Java program to demonstrate different ways to print Exception messages
//printStackTrace method 
public class ExceptionTest1 
{ 
	public static void main(String[] args) 
	{ 
		try
		{ 
			int a = 20/0; 
		} catch (Exception e) 
		{ 
			// printStackTrace method 
			// prints line numbers + call stack 
			e.printStackTrace(); 
			
			System.out.println("-----------------");
			 // toString method 
            System.out.println(e.toString()); 
			
			System.out.println("-----------------");
			// getMessage method 
            // Prints only the message of exception 
            // and not the name of exception 
            System.out.println(e.getMessage()); 
			
			// Prints what exception has been thrown 
			System.out.println("-----------------");
			
			System.out.println("\n"+e); 
		} 
	} 
} 
