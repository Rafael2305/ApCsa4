
/**
 * Write a description of class RareArmor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RareArmor extends Armor
{
    public RareArmor(String name)
    {
        super(name, "Rare", 80, 150, 10);
    }
    
    public boolean blocked()
    {
        int num = (int)(Math.random()*100 + 1);
        if (num <= armorFailure)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
