
/**
 * Write a description of class Consumable here:
 *  
 * Items that can only be used once
 * 
 */
public abstract class Healable extends Item
{
    int healableAmount;
    int healableHeal;
    public Healable(String name, int rarity, int amount, int heal)
    {
        super(name, rarity);
        healableAmount = amount;
        healableHeal = heal;
    }

    public void use()
    {
        System.out.println("You use: " + itemName);
        healableAmount--;
        System.out.println("You have: " + healableAmount + " left");
    }

    public void checkAmount()
    {
        System.out.println("You have " + healableAmount + "left");
    }
}

