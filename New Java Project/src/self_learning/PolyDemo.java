package self_learning;

public class PolyDemo {

	public static void main(String[] args) {

			Poly1 obj[]=new Poly1[2];
			obj[0] = new Poly2();
			obj[1] = new Poly3();
			
			for(int x=0;x<obj.length;x++)
			{
				obj[x].print();
			}
			
	}

}
