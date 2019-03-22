package self_learning;
import java.applet.*;
import java.awt.*;

/*<APPLET
 * CODE =AppletHelloJava.class
 * WIDTH = 400
 * HEIGHT=200
 * </APPLET>
 * 
 * */
public class AppletHelloJava extends Applet

{		
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		String s;
		public void init() 
		{
			setBackground(Color.green);
			setForeground(Color.RED);
			s = getParameter("string");
			if (s==null)
				s = "Java";
			s = "Hello " + s;
			s += " \tInit";
			System.out.println(s);
		}
		
		public void start()
		{
			s += " \tStart";
			System.out.println(s);
		}
		
		public void stop()
		{
			s += "Stop";
			System.out.println(s);
		}
		
		public void destroy()
		{
			s += "Destroy";
			System.out.println(s);
		}
		public void paint(Graphics g)
		{
			g.drawOval(100, 200, 100, 100);
			Font f = new Font("arial", Font.BOLD,40);
			g.setFont(f);
			g.drawString(s, 100, 100);
			g.drawString("Hello Java", 500, 200);
		}
}
