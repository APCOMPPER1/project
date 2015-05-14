
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.image.BufferedImage;
public class Player
{
    private BufferedImage image;
   
    public Player(BufferedImage image){
        this.image = image;
    }
    
    public BufferedImage grabImage(){
        return image;
    }
}