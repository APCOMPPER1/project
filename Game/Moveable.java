public interface Moveable
{
    void setPower(double p); //Sets the speed in the beginning
    void setAngle(double a); //Sets the direction in degrees
    double getPower(); //Sends the power to the Applet
    double getAngle(); //Sends the angle to the applet
    void moveXLocation(); //Changes the X-Location based upon the power and angle
    void moveYLocation(); //Changes the Y-Location based upon the power and angle 
    int getXLocation(); //sends the X-location to the applet 
    int getYLocation(); //sends the Y-location to the applet 
}