
/**
 * Write a description of class Consumable here:
 *  
 * Items that can only be used once
 * 
 */
public abstract class Consumable extends Item
{
    int conAmount;
    public Consumable(String name, int rarity, int amount)
    {
        super(name, rarity);
        conAmount = amount;
    }
    
    public void use()
    {
        System.out.println("You use: " + itemName);
        conAmount--;
        System.out.println("You have: " + conAmount + " left");
    }
}
