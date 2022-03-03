
/**
 * Write a description of class EpicArmor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EpicArmor extends Armor
{
    public EpicArmor(String name)
    {
        super(name, "Epic", 90, 200, 5);
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
