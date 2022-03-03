
/**
 * Write a description of class LengendaryArmor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LegendaryArmor extends Armor
{
    public LegendaryArmor(String name)
    {
        super(name, "Legendary", 100, 250, 1);
    }
    
    public boolean blocked()
    {
        return true;
    }
}
