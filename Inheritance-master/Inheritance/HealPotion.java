
/**
 * Write a description of class HealPotion here:
 *
 * Will heal you, not as strong as Medkit.
 * 
 */
public class HealPotion extends Consumable
{
    public HealPotion(String name, int rarity, int amount)
    {
        super(name, rarity, amount);
    }
    
    public void use()
    {
        System.out.println("You use: " + itemName);
        conAmount--;
        System.out.println("You have: " + conAmount + " left");
        System.out.println();
        System.out.println("________________________");
        System.out.println();
        
        if(itemRarity <= 50)
        {
            System.out.println("You are healed a tiny bit!");
        }
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
