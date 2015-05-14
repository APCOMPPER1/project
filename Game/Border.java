import javax.swing.JFrame;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.Graphics;
import java.awt.geom.*;
	
	class Border extends JFrame{
	  public Border() {
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
        
        Line2D lin1= new Line2D.Float(160,0,160,280);
        Line2D lin2= new Line2D.Float(0,480,280,480);
        Line2D lin3= new Line2D.Float(280,480,400,280);
        Line2D lin4= new Line2D.Float(400,280,560,440);
        Line2D lin5= new Line2D.Float(440,0,560,200);
        Line2D lin6= new Line2D.Float(640,400,800,240);
        Line2D lin7= new Line2D.Float(1000,240,1000,480);
        g2.draw(lin1);
        g2.draw(lin2);
        g2.draw(lin3);
        g2.draw(lin4);
        g2.draw(lin5);
        g2.draw(lin6);
        g2.draw(lin7);
     }
	}