
/**
 * Write a description of class AllOrNothing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CommonArmor extends Armor
{
    public CommonArmor(String name)
    {
        super(name, "Common", 60, 50, 20);
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
