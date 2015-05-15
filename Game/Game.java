
/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JFrame;
import java.awt.*;
import java.awt.image.*;
import java.awt.image.BufferStrategy;
import java.awt.Graphics;
import java.io.IOException;

public class Game extends Canvas implements Runnable {
    public static int width = 1000;
    public static int height = 1000;;
    public static int scale = 1;
    private Thread thread;
    public JFrame frame;
    private boolean running = false;
    private BufferedImage img = null;
    private BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
    private BufferedImage player;

    public void init(){
        ImageLoader loader = new ImageLoader();
        try{
            img = loader.loadImage("sprites/player.png");
        }
        catch(IOException e){
            e.printStackTrace();
        }

        Player p = new Player(img);
        p.grabImage();
    }

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
        init();
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
            //g.setColor(Color.blue);
            //g.fillRect(0,0,width*scale,height*scale);
            //g.drawImage(image,0,0,getWidth(), getHeight(), this);
            g.drawImage(player,100,100,this);
        }
        g.dispose();
        bs.show();   
    }

}
