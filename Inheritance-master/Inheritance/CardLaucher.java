
/**
 * Write a description of class CardLaucher here.
 *
 * Weapon that shoots 4 metal cards at a time, fancy yet effective
 */
public class CardLaucher extends Weapon
{
    public CardLaucher(String name)
    {
        super(name, 70, 40, 200);
    }
    
    public void attack()
    {
        if(weaponDurability >= 0)
        {
            
        }
        else
        {
            System.out.println("It is broken");
        }
    }
    public boolean parry()
    {
        return true;
    }
}
