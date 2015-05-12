/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JFrame;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.Graphics;
public class Game extends Canvas implements Runnable {
    public static int width = 300;
    public static int height = width / 16 * 9;
    public static int scale = 3;
    private Thread thread;
    public JFrame frame;
    private boolean running = false;
    
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
            g.setColor(Color.BLUE);
            
            g.fillRect(0,0,getWidth(), getHeight());
            g.setColor(Color.RED);
            g.fillOval(getWidth()/4-100,100,100,100);
            g.fillOval(getWidth() - getWidth()/4,100,100,100);
            g.setColor(Color.GREEN);
            g.fillRect(getWidth()/2 - 50,getHeight() - getHeight()/4, 100,100);
            
        }
        g.dispose();
        bs.show();   
    }
    
}