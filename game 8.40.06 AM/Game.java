
/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import java.awt.image.BufferStrategy;
import java.awt.Graphics;
import java.io.IOException;
import java.awt.geom.*;

public class Game extends Canvas implements Runnable {
    public static int width = 1000;
    public static int height = 500;
    public static int scale = 1;
    private Thread thread;
    public JFrame frame;
    private boolean running = false;
    private BufferedImage img = null;
    private BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
    private BufferedImage player;
    

    public Game(){
        Dimension size = new Dimension(width * scale, height * scale);
        setPreferredSize(size);
        frame = new JFrame();
    }

    public synchronized void start() {
        running = true;
        thread = new Thread(this, "Display");
        thread.start();
    }

    public synchronized void stop() {
        running = false;
        try{
            thread.join();
        }
        catch(InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public void run(){
        
        while (running){
            update();//logic behind actions
            render();//put images on screen
        }
    }

    public void update(){

    }

    public void render(){
        BufferStrategy bs = getBufferStrategy();
        if(bs == null){
            createBufferStrategy(3);
            return;
        }
        Graphics g = bs.getDrawGraphics();
        {
            Graphics2D g2 = (Graphics2D) g;
            //barriers
            g.drawLine(160,0,160,280);
            g.drawLine(0,480,280,480);
            //Line2D lin1= new Line2D.Float(160,0,160,280);
            //Line2D lin2= new Line2D.Float(0,480,280,480);
            Line2D lin3= new Line2D.Float(280,480,400,280);
            Line2D lin4= new Line2D.Float(400,280,560,440);
            Line2D lin5= new Line2D.Float(440,0,560,200);
            Line2D lin6= new Line2D.Float(640,400,800,240);
            Line2D lin7= new Line2D.Float(1000,240,1000,480);
            //g2.draw(lin1);
            //g2.draw(lin2);
            g2.draw(lin3);
            g2.draw(lin4);
            g2.draw(lin5);
            g2.draw(lin6);
            g2.draw(lin7);

        }
        g.dispose();
        bs.show();   
    }

}
