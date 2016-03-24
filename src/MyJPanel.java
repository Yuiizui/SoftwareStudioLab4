
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.*;


public class MyJPanel extends JPanel implements MouseMotionListener{
	
	private Square square = new Square(100);
	private int x;
	private int y;
	
	public MyJPanel(){
		addMouseMotionListener(this);
	}
	protected void paintComponent(Graphics g){
		super.paintComponent(g);//inherit from super class
		g.drawRect(x,y,square.getShapeHeight(),square.getShapeWidth());
		g.fillRect(x,y,square.getShapeHeight(),square.getShapeWidth());
		g.setColor(square.getRandomColor());
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Get mouse dragged position and change suqare's position
		x = square.getCenterX(e.getX());
		y= square.getCenterY(e.getY());
		
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// No need to implement
	}
}
