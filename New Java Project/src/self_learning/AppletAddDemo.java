package self_learning;
import	java.applet.*;
import java.awt.*;

public class AppletAddDemo extends Applet
{
	public void init() 
	{
		setBackground(Color.blue);
		setForeground(Color.white);
	}
	
	public void paint(Graphics g)
	{
		int a = 100;
		int b = 250;
		int c = a+b;
		String s = "Addition of 100 & 250 is " + String.valueOf(c);
		Font f = new Font("arial", Font.BOLD,40);
		g.setFont(f);
		g.drawString(s, 100, 100);
		
	}
}
