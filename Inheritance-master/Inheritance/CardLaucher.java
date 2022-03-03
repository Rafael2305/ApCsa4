
/**
 * Write a description of class CardLaucher here.
 *
 * Weapon that shoots 4 metal cards at a time, fancy yet effective
 */
public class CardLaucher extends Weapon
{
    int cardAmount;
    public CardLaucher(String name, int amount)
    {
        super(name, "Rare", 40, 200);
        cardAmount = amount;
    }
    
    public void attack()
    {
        if(weaponDurability >= 0)
        {
            if(cardAmount >= 4)
            {
                System.out.println("4 cards load into the laucher.");
                System.out.println("You pull the trigger.");
                System.out.println("40 Damage.");
                System.out.println("Weapon durability -4");
                System.out.println();
                cardAmount -= 4;
                weaponDurability -= 4;
            }
            else
            {
                System.out.println("You do not have enough cards to attack.");
                System.out.println();
                weaponDamage = 0;
            }
        }
        else
        {
            System.out.println("It is broken, you cannot do damage.");
            System.out.println();
            weaponDamage = 0;
        }
    }
    public boolean parry()
    {
        return true;
    }
}
