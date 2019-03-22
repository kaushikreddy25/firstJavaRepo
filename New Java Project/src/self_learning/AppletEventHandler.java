package self_learning;
import	java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AppletEventHandler extends Applet implements KeyListener, MouseListener, MouseMotionListener
{
	String msg = "";
	int xp=0, yp = 0;

	public void init() 
	{
		setBackground(Color.black);
		setForeground(Color.white);
		addMouseListener(this);
		addMouseMotionListener(this);
		addKeyListener(this);
	}

	public void mouseClicker(MouseEvent m)
	{
		xp = m.getX();
		yp = m.getY();
		msg = "Mouse Clicked";
		repaint();
	}
		
	public void mousePressed(MouseEvent m)
	{
		xp = m.getX();
		yp = m.getY();
		msg = "Mouse Pressed";
		repaint();
	}	

	public void mouseReleased(MouseEvent m)
	{
		xp = m.getX();
		yp = m.getY();
		msg = "Mouse Released";
		repaint();
	}	
	
	public void mouseDragged(MouseEvent m)
	{
		xp = m.getX();
		yp = m.getY();
		msg = "Mouse Moved at " +xp+ "   "+yp;
		repaint();
	}	

	public void mouseMoved(MouseEvent m)
	{
		xp = m.getX();
		yp = m.getY();
		msg = "Mouse Moved at " +xp+ "   "+yp;
		repaint();
	}	
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) 
	{
		msg = "Key Pressed";
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent arg0) 
	{
		msg = "Key Released";
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	public void paint(Graphics g)
	{
		Font f = new Font("arial", Font.BOLD,20);
		g.setFont(f);
		g.drawString(msg, xp, yp);
		Font f1 = new Font("arial", Font.BOLD,30);
		g.setFont(f1);
		g.drawString("This applet senses mouse and keyboard events", 700, 450);
	}




}
