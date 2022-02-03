
/**
 * Write a description of class Consumable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Consumable extends Item
{
    int amountOf;
    public Consumable()
    {
        amountOf = 0;
    }
    public Consumable(String name)
    {
        super(name);
    }
}
