import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game extends JFrame {
    private JButton Enter;
    private JLabel pow;
    private JTextField getPower;
    private JLabel ang;
    private JLabel attempts;
    private JTextField getAngle;
    private GamePanel bottom;
    private int tries = 0;
    
    
    
    public Game() {
        // initialize
        setSize(854,580);
        setTitle("Game");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // init panels
        JPanel top = new JPanel();
        bottom = new GamePanel();
        top.setBackground(Color.cyan);
        attempts = new JLabel("Tries : " + Integer.toString(tries));
        JButton Enter = new JButton("Enter");
        JLabel pow = new JLabel("Power: ");
        JLabel ang = new JLabel("Angle: ");
        JTextField getPower = new JTextField(5);
        JTextField getAngle = new JTextField(5);
        Enter.addActionListener(new ButtonListener());
        top.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        top.setBackground(Color.cyan);
        top.add(pow);
        top.add(getPower);
        top.add(ang);
        top.add(getAngle);
        top.add(Enter);
        top.add(attempts);
        
        top.setSize(854,100);
        top.setPreferredSize(new Dimension(854, 100));
        top.setLocation(0, 0);
        
        bottom.setSize(854, 480);
        bottom.setPreferredSize(new Dimension(854, 480));
        bottom.setLocation(0, 100);
        
        
        // add to frame
         add(top, BorderLayout.NORTH);
        add(bottom, BorderLayout.SOUTH);
        
        // start
        setVisible(true);
        bottom.start();
    }
    public double getPower(){
        double pow = Double.parseDouble(getPower.getText());
        return pow;
    }
    public double getAngle(){
        double ang = Double.parseDouble(getAngle.getText());
        return ang;
    }
    public static void main (String [] args){
        Game game = new Game();
        
    }
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            tries++;
            attempts.setText("Tries : " + Integer.toString(tries));
            
            repaint();
           bottom.update();
        }
    }
}