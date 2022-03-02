
/**
 * Write a description of class EnergySword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AdjectiveSword extends Weapon
{
    String swordAdj;
    public AdjectiveSword(String name, int damage, String adj)
    {
        super(name, 75, damage, 100);
        swordAdj = adj;
    }
    
    public void attack()
    {
        System.out.println("You pull out your " + swordAdj + " sword.");
        System.out.println("You get ready to strike.");
        System.out.println("SLASH!!");
        System.out.println("You do " + weaponDamage + " damage.");
        System.out.println();
    }
    
    public boolean parry()
    {
        return true;
    }
}
