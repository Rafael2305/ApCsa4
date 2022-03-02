
/**
 * Write a description of class HealPotion here:
 *
 * Will heal you for 50hp.
 * 
 */
public class HealPotion extends Healable
{
    public HealPotion(String name, int amount)
    {
        super(name, 25 , amount, 50);
    }
    
    public void use()
    {
        System.out.println("You drink: " + itemName);
        System.out.println("Type: Heal Potion");
        healableAmount--;
        System.out.println("You have: " + healableAmount + " left");
        System.out.println();
        System.out.println("________________________");
        System.out.println();
        System.out.println("You will be healed for 50hp.");
        System.out.println();
    }
    
    public void checkAmount()
    {
        System.out.println("You have " + healableAmount + "left");
    }
}
