import java.lang.Math;
public class Ball implements Moveable
{
    private double angle;
    private double power;
    private int xLocation;
    private int yLocation;
    private final double DEACCELERATION = 3.528;

    
    //Gives the ball a location and sets the angle and power at 0
    public Ball(int xPos, int yPos) 
    {
        xLocation = xPos;
        yLocation = yPos;
        angle = 0;
        power = 0;
    }
    
    //does what the names says
    public void setPower(double newPower)
    {
        power = newPower;
    }
    
    //does what the names says
    public void setAngle(double newAngle)
    {
        angle = newAngle;
    }
    
    //does what the names says
    public double getPower()
    {
        return power;
    }
    
    //does what the names says
    public double getAngle()
    {
        return angle;
    }
    
    //moves the x-Location
    public void moveXLocation()
    {
        double velocity;
        if((angle < 90 && angle >= 0) || (angle > 270 && angle <= 360 ))
        {
            velocity = power*(Math.cos(angle));
        }
        else
        {
            velocity = -1*power*(Math.cos(angle));
        }
        
        while(velocity != .005)
        {
           xLocation += velocity;
           velocity = Math.sqrt(Math.pow(velocity,2) + 2*DEACCELERATION*velocity);
        }
    }
    
    //moves y-Location
    public void moveYLocation()
    {
        double velocity;
        if(angle >= 0 && angle < 180)
        {
            velocity = power*(Math.sin(angle));
        }
        else
        {
            velocity = -1*power*(Math.sin(angle));
        }
        
        while(velocity != .005)
        {
           xLocation += velocity;
           velocity = Math.sqrt(Math.pow(velocity,2) + 2*DEACCELERATION*velocity);
        } 
    }
    
    //Returns the positon to the applet
    public int getXLocation()
    {
        return xLocation;
    }
    
    public int getYLocation()
    {
        return yLocation;
    }
    
}
