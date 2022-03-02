
/**
 * Write a description of class Medkit here:
 *
 * Will heal you for 100hp.
 * 
 */
public class Medkit extends Healable
{
    public Medkit(String name, int amount)
    {
        super(name, 50, amount, 100);
    }
    
    public void use()
    {
        System.out.println("You use: " + itemName);
        System.out.println("Type: Medkit");
        healableAmount--;
        System.out.println("You have: " + healableAmount + " left");
        System.out.println();
        System.out.println("________________________");
        System.out.println();
        System.out.println("You will be healed for 100hp");
        System.out.println();
    }
    
    public void checkAmount()
    {
        System.out.println("You have " + healableAmount + "left");
    }
}
