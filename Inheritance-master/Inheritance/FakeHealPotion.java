
/**
 * Write a description of class NothingPotion here.
 *
 * Doesn't heal you, it is fake.
 */
public class FakeHealPotion extends Healable
{
    public FakeHealPotion(String name, int amount)
    {
        super(name, 5, amount, 0);
    }
    
    public void use()
    {
        System.out.println("You use: " + itemName);
        System.out.println("Type: Nothing Potion");
        healableAmount--;
        System.out.println("You have: " + healableAmount + " left");
        System.out.println();
        System.out.println("________________________");
        System.out.println();
        
        System.out.println("Did nothing, does taste like cherry though.");
        System.out.println("Tasty!");
    }
}
