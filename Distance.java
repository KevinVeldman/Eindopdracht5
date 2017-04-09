
/**
 * Distance class includes the time and distance a contestant has. It is
 * also used to calculate scores.
 *
 * @author:     Kevin Veldman
 * @version:    1.0
 * @email:      me@kevinpv.com
 */
public class Distance
{
    // instance variables - replace the example below with your own
    private int distance;
    private int time;

    /**
     * Constructor for objects of class Distance
     */
    public Distance(int newDistance)
    {
        // initialise instance variables
        distance = newDistance;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setTime(int newTime)
    {
        time = newTime;
    }
    public int getTime()
    {
        return time;
    }
    public double getPoints(boolean getReturn)
    {
        if(distance == 500)
        {
            if(getReturn == true)
            {
                System.out.println (time);
            }
            return time;
        }
        else if(distance == 1000)
        {
            if(getReturn == true)
            {
                System.out.println (time/2);
            }
            return time/2;
        }
        else if(distance == 1500)
        {
            if(getReturn == true)
            {
                System.out.println( time/3);
            }
            return time/3;
        }
        else if(distance == 5000)
        {
            if(getReturn == true)
            {
                System.out.println( time/10);
            }
            return time/10;
        }
        else
        {
            System.out.println("ERROR: An invalid distance was registered, score is set to 9999");
            return 999999;
        }
    }
    public double scoreCalculation(double time)
    {
        double score =  (time/100) * 3.1415926;
        return score;
    }
}
