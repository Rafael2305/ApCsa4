
/**
 * Abstract class Vehicle - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Vehicle //There is a secret....It auto-extends Object.
{
    String engineType;
    public Vehicle(String engine)
    {
        engineType = engine;
    }
    public Vehicle()
    {
        engineType = "Gas powered";
    }
    public void move()
    {
        System.out.println("You moved forward");
    }
    public abstract void moveBackward();
}
