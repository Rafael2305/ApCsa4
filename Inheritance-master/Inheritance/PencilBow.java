
/**
 * Write a description of class PencilCrossbow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PencilBow extends Weapon
{
    int pencilAmount;
    public PencilBow(String name, int amount)
    {
        super(name, "Uncommon", 20, 200);
        pencilAmount = amount;
    }
    
    public void attack()
    {
        if(weaponDurability >= 0)
        {
            if(pencilAmount >= 1)
            {
                System.out.println("You grab a pencil.");
                System.out.println("You start to get the bow ready.");
                System.out.println("You release the pencil and it goes.");
                
                int num = (int)(Math.random()*100 + 1);
                if (num <= 10)
                {
                    System.out.println("You missed =(");
                    System.out.println("Weapon durability -5");
                    System.out.println();
                    pencilAmount--;
                    weaponDurability -= 5;
                }
                else
                {
                    System.out.println("You hit them!");
                    System.out.println("20 Damage.");
                    System.out.println("Weapon durability -5");
                    System.out.println();
                    pencilAmount--;
                    weaponDurability -= 5;                
                }
            }
            else
            {
                System.out.println("You do not have a pencil to use.");
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
        return false;
    }
}
