import javax.swing.JFrame;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.Graphics;
import java.awt.geom.*;
	
	class MyFrame extends JFrame {
	  public MyFrame() {
		setTitle("My Empty Frame");
		setSize(300,200); // default size is 0,0
		setLocation(10,200); // default is 0,0 (top left corner)
	  }
	
	  public static void main(String[] args) {
	    JFrame f = new MyFrame();
	    f.show();
	  }
	  
        public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Line2D lin = new Line2D.Float(100, 100, 250, 260);
        
        g2.draw(lin);
     }
	}