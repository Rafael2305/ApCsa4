
/**
 * Write a description of class HealRoot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HealRoot extends Healable
{
    public HealRoot(String name, int amount)
    {
        super(name, 100 , amount, 200);
    }
    
    public void use()
    {
        System.out.println("You use: " + itemName);
        System.out.println("Type: Heal root");
        healableAmount--;
        System.out.println("You have: " + healableAmount + " left");
        System.out.println();
        System.out.println("________________________");
        System.out.println();
        System.out.println("You eat the heal root.");
        System.out.println("You instanly feel better.");
        System.out.println("You will be healed for 200hp.");
        System.out.println();
    }
    
    public void checkAmount()
    {
        System.out.println("You have " + healableAmount + "left");
    }
}
