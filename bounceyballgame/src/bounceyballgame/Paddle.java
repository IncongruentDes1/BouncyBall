package bounceyballgame;


import javax.swing.JComponent;
import java.awt.*;


public class Paddle extends JComponent{
			Integer xLocation = 250;
	
	
    public void paint(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawRect(xLocation, 500, 80, 15);
    }
    
    public void moveLeft() {
    	xLocation -= 10;
    	this.paint(getGraphics());
    	
    }
    
    public void moveRight() {
    	xLocation += 10;
    	this.paint(getGraphics());
    	
    }

}
