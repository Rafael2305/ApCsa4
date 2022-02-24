
/**
 * Write a description of class HealPatch here.
 *
 * Will not heal you for a lot but are very common
 */
public class HealPatch extends Healable
{
    public HealPatch(String name, int amount)
    {
        super(name, 10 , amount, 5);
    }
    
    public void use()
    {
        System.out.println("You use: " + itemName);
        System.out.println("Type: Heal Potion");
        healableAmount--;
        System.out.println("You have: " + healableAmount + " left");
        System.out.println();
        System.out.println("________________________");
        System.out.println();
        System.out.println("You will be healed for 5hp.");
        System.out.println();
    }
}
