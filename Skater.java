import java.util.ArrayList;

/**
 * Skater class includes the personal data of a single contestant, using an array
 * list to contain the distances the contestant will participate in.
 *
 * @author:     Kevin Veldman
 * @version:    1.0
 * @email:      me@kevinpv.com
 */

public class Skater
{
    // instance variables - replace the example below with your own
    public String name;
    private ArrayList<Distance> times;
    private int returnint;

    /**
     * Constructor for objects of class Skater
     */
    public Skater(String skaterName)
    {
        name = skaterName;
        times = new ArrayList();
        times.add(new Distance(500));
        times.add(new Distance(1000));
        times.add(new Distance(1500));
        times.add(new Distance(5000));
        returnint = 0;
    }
    public String getName()
    {
        return name;
    }
    public void setTime(int distance, int time)
    {
        if(distance == 500)
        {
            times.get(0).setTime(time);
        }
        else if(distance == 1000)
        {
            times.get(1).setTime(time);
        }
        else if(distance == 1500)
        {
            times.get(2).setTime(time);
        }
        else if(distance == 5000)
        {
            times.get(3).setTime(time);
        }
        else
        {
            System.out.println("Distance is invalid, please enter a distance in meters");
        }
    }
    public void getPoints(int distance)
    {
        System.out.println("The score from: " + name + "\nfor distance: " + distance + "m\n" );
        if(distance == 500)
        {
            times.get(0).getPoints(true);
        }
        else if(distance == 1000)
        {
            times.get(1).getPoints(true);
        }
        else if(distance == 1500)
        {
            times.get(2).getPoints(true);
        }
        else if(distance == 5000)
        {
            times.get(3).getPoints(true);
        }
    }
    public int getTime(int distance)
    {
        returnint = 0;
        if(distance == 500)
        {
            returnint = times.get(0).getTime();
        }
        else if(distance == 1000)
        {
            returnint = times.get(1).getTime();
        }
        else if(distance == 1500)
        {
            returnint = times.get(2).getTime();
        }
        else if(distance == 5000)
        {
            returnint = times.get(3).getTime();
        }
        else
        {
            System.out.println("ERROR: an invalid (or no) time was registered for" + name );
            returnint = 999999;
        }
        if(returnint == 0)
        {
            System.out.println("ERROR: No time was registered for: " + name +" score set to 9999999");
            returnint = 999999;
        }
        return returnint;
    }
    public double getTotalPoints()
    {
        double totalPoints = 9999;
        if(times.get(0).getPoints(false) != 0 && times.get(1).getPoints(false) != 0 && times.get(2).getPoints(false) != 0 && times.get(3).getPoints(false) != 0)
        {
            totalPoints =times.get(0).getPoints(false) + times.get(1).getPoints(false) + times.get(2).getPoints(false) + times.get(3).getPoints(false);
        }
        else
        {
            System.out.println("No score was found for one or more distances of skater: " +name);
        }
        return totalPoints;
    }
}
