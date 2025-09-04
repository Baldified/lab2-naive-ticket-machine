
/**
 * Write a description of class step35 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class step35
{
    // instance variables - replace the example below with your own
    private boolean alive;

    /**
     * Constructor for objects of class step35
     */
    public step35()
    {
        alive = true;
    }

    /**
     * set dead or alive
     */
    public boolean setState(boolean status)
    {
        alive = status;
        return alive;
    }
}