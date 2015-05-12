/**
 * Write a description of class MAIN here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
public class MAIN
{
    public static void main(String[] args){
        Game game = new Game();
        game.frame.setResizable(false);
        game.frame.setTitle("Prithvi");
        game.frame.add(game);
        game.frame.pack();
        game.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.frame.setLocationRelativeTo(null);
        game.frame.setVisible(true);
        game.start();
    }
}