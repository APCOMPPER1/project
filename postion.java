
/**
 * Write a description of class postion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class postion
{
    private double intialPostion;
    final private double acceleration = -.36;
    private double velocity;
    private angle;
    public position(double x, double v,double an)
    {
        intialPostion = x;
        velocity = v;
        angle = an;
    }
    public double endPosition()
    {
        double a = -(velocity*velocity)/(2*acceleration);
        double t = a/acceleration;
        return = 1/2*acceleration*t*t + velocity*t + intialPostion;
    }
    public double line()
    {
        //testing adding line to see if changes will save to project
    }
