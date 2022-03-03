
/**
 * Write a description of class UncommonArmor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UncommonArmor extends Armor
{
    public UncommonArmor(String name)
    {
        super(name, "Uncommon", 70, 100, 15);
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
