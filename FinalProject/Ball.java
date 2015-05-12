
/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball implements Moveable
{
    private double ballPower;
    private double ballAngle;
    private int xPosition;
    private int yPosition;
    

    /**
     * Constructor for objects of class Ball
     */
    public Ball(int xPos , int yPos )
    {
        xPosition = xPos;
        yPosition = xPos;
    }

    public double getPower(){
        return ballPower;
    }
    public double getAngle(){
        return ballAngle;
    }
    public void setPower(int newPower){
        ballPower = newPower;
    }
    public void setAngle(int newAngle){
        ballAngle = newAngle;
    }
}
