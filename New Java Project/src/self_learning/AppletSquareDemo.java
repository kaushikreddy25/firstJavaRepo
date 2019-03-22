package self_learning;
import	java.applet.*;
import java.awt.*;

public class AppletSquareDemo extends Applet
{
	public void init() 
	{
		setBackground(Color.black);
		setForeground(Color.white);
	}
	
	public void paint(Graphics g)
	{
		Font f = new Font("arial", Font.BOLD,10);
		g.setFont(f);
		int i, k=0;
		g.drawString("i \t Square \t Cube", 50, 50);
		
		
		for (i=0;i<=20;i++)
		{
			String s = String.valueOf(i) + "          " + String.valueOf(i*i) + "          " + String.valueOf(i*i*i); 
			g.drawString(s, 50, 60+k);
			k+=20;
		}		
		
	}
}