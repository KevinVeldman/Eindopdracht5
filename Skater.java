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
    private String name;
    private ArrayList<Distance> times;
    private int returnint;

    /**
     * Constructor for objects of class Skater
     */
    public Skater(String skaterName)
    {
        name = skaterName;
        times = new ArrayList();
        returnint = 0;
    }
    public String getName()
    {
        return name;
    }
    public void setTime(int distance, int time)
    {
        times.add(new Distance(distance, time));
    }
    public void getPoints(int distance)
    {
        System.out.println("The score from: " + name + "\nfor distance: " + distance + "m\n" );
        for(Distance dist:times){
            if(dist.getDistance()==distance){
                dist.getPoints(true);
            }
            else{
                System.out.println("invalid distance");
            }
        }
    }
    public int getTime(int distance)
    {
        int returnint = 0;
        for(Distance dist:times){
            if(dist.getDistance()==distance){
                returnint = dist.getTime();
            }
            else{
                System.out.println("invalid distance");
            }
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
