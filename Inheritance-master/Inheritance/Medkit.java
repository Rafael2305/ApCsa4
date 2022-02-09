
/**
 * Write a description of class Medkit here:
 *
 * Will heal you, stronger then HealPotion (plus 50 rarity).
 * 
 */
public class Medkit extends Consumable
{
    public Medkit(String name, int rarity, int amount)
    {
        super(name, rarity += 50, amount);
    }
    
    public void use()
    {
        System.out.println("You use: " + itemName);
        conAmount--;
        System.out.println("You have: " + conAmount + " left");
        System.out.println();
        System.out.println("________________________");
        System.out.println();
        
        if(itemRarity > 50 && itemRarity <= 100)
        {
            System.out.println("You are healed a little bit!");
        }
        if(itemRarity > 100 && itemRarity <= 150)
        {
            System.out.println("You are healed a bit!");
        }
        if(itemRarity > 150)
        {
            System.out.println("You are fully healed!");
        }
    }
}
