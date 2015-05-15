import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

/**
 * Template 
 * 
 * Name: 
 * Date:
 * Program name:
 */
public class Checkerboard extends Applet
{
  
    /**
     * Paint method for applet.
     * 
     * @param  g   the Graphics object for this applet
     */
    public void paint(Graphics g)
    {
        int width =getWidth();
        int height=getHeight();
        int [][] check = new int[width][height];
         for ( int row = 0;  row <= width;  row= row+(width/4) ) {
             for ( int col = 0;  col <= height;  col= col+(height/4)) {
                 g.setColor(Color.red);
                 g.fillRect(row,col,width/8,height/8);
                }
                }
         for ( int row = width/8;  row <= width;  row= row+(width/4) ) {
             for ( int col = 0;  col <= height;  col= col+(height/4)) {
                 g.setColor(Color.BLACK);
                 g.fillRect(row,col,width/8,height/8);
                }
                }
         for ( int row = width/8;  row <= width;  row= row+(width/4) ) {
             for ( int col = height/8;  col <= height;  col= col+(height/4)) {
                 g.setColor(Color.red);
                 g.fillRect(row,col,width/8,height/8);
                }
                }
         for ( int row = 0;  row <= width;  row= row+(width/4) ) {
             for ( int col = height/8;  col <=height;  col= col+(height/4)) {
                 g.setColor(Color.BLACK);
                 g.fillRect(row,col,width/8,height/8);
                 
                }
                }
                
         for ( int row = 0;  row <=width;  row= row+(width/4) ) {
             for ( int col = height/8;  col <= height/2;  col= col+(height/4)) {
                 
                 g.setColor(Color.WHITE);
                 g.fillOval(row,col,width/8,height/8);
               
                }
                }
        
         for ( int row = width/2;  row <= width;  row= row+(width/4) ) {
             for ( int col = 3*height/8;  col <= height-height/8;  col= col+(height/4)) {
                 g.setColor(Color.white);
                 g.drawOval(row,col,width/8,height/8);
                }
                }
                
                g.setColor(Color.WHITE);
                g.drawOval(width/4,5*height/8,width/8,height/8);
        }
    }