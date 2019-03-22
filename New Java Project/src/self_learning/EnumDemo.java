package self_learning;

public class EnumDemo 
{
	
	enum Mobile
	{
			Apple(5000), Samsung(20000), Asus;
	
		int price;
		
		Mobile()
		{
			price = 10500; 
		}	
		
		Mobile(int p)
		{
			price = p; 
		}	
		public int showPrice()
		{
			System.out.println("Price is ");
			return price;
		}		
	}

	public static void main(String[] args) 
	{
		
			System.out.println(Mobile.Apple.showPrice());
			System.out.println(Mobile.Samsung.showPrice());
			System.out.println(Mobile.Asus.showPrice());
	}

}
