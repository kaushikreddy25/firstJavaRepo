package self_learning;

public class TestThis {
	//Java code for using 'this' keyword to 
	//refer current class instance variables 
	
		int a; 
		int b; 
		
		// Parameterized constructor 
		TestThis(int a, int b) 
		{ 
			this.a = a; //If u remove 'this' then it will be Formal Parameter a = FP a ,but output is calling Local variable a so output will be a=0
			this.b = b;  // to use local variable a = FP a we use this.a=a , bcoz priority is given to FP by java.
		} 

		void display() 
		{ 
			//Displaying value of variables a and b 
			System.out.println("a = " + a + " b = " + b); 
		} 

		public static void main(String[] args) 
		{ 
			TestThis object = new TestThis(10, 20); 
			object.display(); 
		} 
	} 



