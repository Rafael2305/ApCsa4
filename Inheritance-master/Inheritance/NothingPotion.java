
/**
 * Write a description of class NothingPotion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NothingPotion extends Consumable
{
    public NothingPotion(String name, int rarity, int amount)
    {
        super(name, rarity, amount);
    }
    
    public void use()
    {
        System.out.println("You use: " + itemName);
        System.out.println("Type: Nothing Potion");
        conAmount--;
        System.out.println("You have: " + conAmount + " left");
        System.out.println();
        System.out.println("________________________");
        System.out.println();
        
        System.out.println("Did nothing, does taste like cherry though.");
        System.out.println("Tasty!");
        
    }
}
