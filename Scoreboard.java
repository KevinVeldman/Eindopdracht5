import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Scoreboard
{
    // instance variables - replace the example below with your own
    private ArrayList<Skater> skaters;
    private int skatercount;
    private int bestTime;
    private double bestScore;
    private String winnerName;

    /**
     * Constructor for objects of class Scoreboard
     */
    public Scoreboard()
    {
        skaters = new ArrayList();
        skatercount = 0;
    }
    /*
     * Function to add a new skater.
     */
    public void addSkater(String name)
    {
        skaters.add(new Skater(name));
    }
    /*
     * Returns all skaters with their skaterid in front of their name.
     */
    public void getSkaterList(){
        System.out.println("Skaters: \n"); 
        skatercount = 0;
        for(Skater name : skaters)
        {
            System.out.println(skatercount + ". " + name.getName());
            skatercount += 1;
        }
        System.out.println("------------------------------");
    }
    /*
     * Returns the winner of a single distance (input in meters)
     */
    public void getWinnerOfDistance(int distance){
        skatercount = skaters.size();
        bestTime = Integer.MAX_VALUE;
        for(int i=0; i<skatercount; i++)
        {
            if(this.getTime(i, distance)<bestTime)
            {
                bestTime = this.getTime(i,distance);
                winnerName = this.getName(i);
            }
        }
        System.out.println("The winner of the "+ distance +"m is: "+winnerName +"\nin a time of: "+bestTime);
        
    }
    /*
     * Returns the points of a single dinstance points.
     */
    public void getPoint(int skaterid, int distance){
        
        if(skaterid>=0 && skaterid < skaters.size())
        {
            skaters.get(skaterid).getPoints(distance);
        }
        else
        {
            System.out.println("ERROR: skaterid does not exist!");
        }
    }
    /*
     * Sets the time for a single distance of a skater.
     */
    public void setTime(int skaterid, int distance, int time){
        if(skaterid>=0 && skaterid < skaters.size())
        {
            skaters.get(skaterid).setTime(distance, time);}
        else
        {
            System.out.println("ERROR: skaterid does not exist!");
        }
    } 
    /*
     * Gets the name of a skater by their ID.
     */
    public String getName(int skaterid){
        if(skaterid>=0 && skaterid < skaters.size())
        {
            return skaters.get(skaterid).getName();
        }
        else
        {
            System.out.println("ERROR: skaterid does not exist!");
            return "INVALID SKATER ID WAS LOOKED UP";
        }
    } 
    /*
     * Returns the time of a skater on a single distance.
     */
    public int getTime(int skaterid, int distance){
        if(skaterid>=0 && skaterid < skaters.size())
        {
            return skaters.get(skaterid).getTime(distance);
        }
        else
        {
            System.out.println("ERROR: skaterid does not exist!");
            return 999999;
        }
    }
    /*
     * Gets the total points of a skater by their ID.
     */
    public double getTotalPoints(int skaterid){
        return skaters.get(skaterid).getTotalPoints();
    }
    /*
     * Uses the total points methods to calculate the overall winner of the tournament.
     */
    public void getOverallWinner(){
        bestScore = 999999;
        skatercount = skaters.size();
        for(int x=0; x< skatercount; x++)
        {
            if(this.getTotalPoints(x)<bestScore)
            {
                bestScore = this.getTotalPoints(x);
                winnerName = this.getName(x);
            }
        }
        System.out.println("Congratulations to: "+winnerName+" for being the overall winner with a score of: "+bestScore);
    }
    /*
     * Function inputting test data with as a clear winner Duc, Donald.
     */
    public void insertTestData(){
        skaters.clear();
        skatercount = 0;
        this.addSkater("Case, Justin");
        this.setTime(skatercount, 500, 35020);
        this.setTime(skatercount, 1000, 62210);
        this.setTime(skatercount, 1500, 122812);
        this.setTime(skatercount, 5000, 183001);
        skatercount++;
        this.addSkater("Tess, Nell");
        this.setTime(skatercount, 500, 35021);
        this.setTime(skatercount, 1000, 62519);
        this.setTime(skatercount, 1500, 142812);
        this.setTime(skatercount, 5000, 183201);
        skatercount++;
        this.addSkater("Duc, Donald");
        this.setTime(skatercount, 500, 25520);
        this.setTime(skatercount, 1000, 45210);
        this.setTime(skatercount, 1500, 111812);
        this.setTime(skatercount, 5000, 164291);
        skatercount++;
        this.addSkater("List, Alko ho");
        this.setTime(skatercount, 500, 35220);
        this.setTime(skatercount, 1000, 62458);
        this.setTime(skatercount, 1500, 120012);
        this.setTime(skatercount, 5000, 171001);
        skatercount++;
        this.addSkater("Wortel, Wilhelm");
        this.setTime(skatercount, 500, 25999);
        this.setTime(skatercount, 1000, 62710);
        this.setTime(skatercount, 1500, 121892);
        this.setTime(skatercount, 5000, 191091);
        skatercount++;
        this.addSkater("Ter Ham, Beau");
        this.setTime(skatercount, 500, 44001);
        this.setTime(skatercount, 1000, 91299);
        this.setTime(skatercount, 1500, 162212);
        this.setTime(skatercount, 5000, 222801);
        skatercount++;
        this.addSkater("Dwyer, Barb");
        this.setTime(skatercount, 500, 31501);
        this.setTime(skatercount, 1000, 62915);
        this.setTime(skatercount, 1500, 123819);
        this.setTime(skatercount, 5000, 191402);
        skatercount++;
    }
}
