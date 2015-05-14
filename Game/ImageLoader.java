
/**
 * Write a description of class ImageLoader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.image.*;
import javax.imageio.*;
import java.io.IOException;
public class ImageLoader
{
    private BufferedImage image;
    public BufferedImage loadImage(String path) throws IOException{
        
        image = ImageIO.read(getClass().getResource(path));
        return image;
    }
}
