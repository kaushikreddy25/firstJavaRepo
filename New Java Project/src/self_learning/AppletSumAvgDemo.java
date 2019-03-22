package self_learning;
import	java.applet.*;
import java.awt.*;

public class AppletSumAvgDemo extends Applet

{
	TextField text1,text2,text3;
	public void init() 
	{
		//setBackground(Color.black);
		setForeground(Color.red);
		text1 = new TextField(10);
		text2 = new TextField(10);
		text3 = new TextField(10);
		add(text1);
		add(text2);
		add(text3);
		text1.setText("0");
		text2.setText("0");
		text3.setText("0");
	}
	
	public void paint(Graphics g)
	{
		int a =0,b=0,c=0;
		int sum;
		double avg;
		String s1,s2,s3,add_str, avg_str;
		Font f = new Font("arial", Font.BOLD,20);
		g.setFont(f);
		g.drawString("Input Numbers in each box", 10, 50);
		
		try
		{
			s1 = text1.getText();
			a=Integer.parseInt(s1);
			
			s2 = text2.getText();
			b=Integer.parseInt(s2);
			
			s3 = text3.getText();
			c=Integer.parseInt(s3);
		}
		catch(Exception e) {}
		
		sum = a+b+c;
		avg = a+b+c/3;
		
		add_str = String.valueOf(sum);
		avg_str = String.valueOf(avg);
		
		g.drawString("The Sum is", 10, 75);
		g.drawString(add_str, 200, 75);
		
		g.drawString("The Average is ", 10, 100);
		g.drawString(avg_str, 250, 100);
				
	}
	
	public boolean action(Event event, Object object)
	{
		repaint();
		return true;
	}
}
