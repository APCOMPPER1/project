import javax.swing.*;
import java.awt.image.*;
import javax.imageio.*;
import java.awt.*;
import java.io.*;

public class GamePanel extends JPanel {
    // ball image
    private BufferedImage ball;
    
    // ball coords
    private double x, y;
    private double vel, xvel, yvel;
    
    
    //Game g = new Game();
    
    public GamePanel() {
        setSize(854, 480);
        
        // init vars
        x = 50;
        y = 50;
        
        // load assets
        try {
            ball = ImageIO.read(new File("ball.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void start() {
        try {
            while(true) {
                update();
                repaint();
                Thread.sleep(10);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void update() {
        /*vel = g.getPower();
        xvel = vel * Math.cos(g.getAngle());
        yvel = vel * Math.sin(g.getAngle());
        x += xvel;
        y += yvel;*/
    }
    
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(0, 0, 854, 480);
        g.drawImage((Image) ball, (int)x, (int)y, null);
    }
}