
/**
 * Write a description of class Rock here.
 *
 * It is a rock, pretty self explanatory chance of missing.
 */
import java.lang.Math;
public class Rock extends Weapon
{
    int rockAmount;
    public Rock(String name, int amount)
    {
        super(name, 1, 10, 1);
        rockAmount = amount;
    }
    
    public void attack()
    {
        System.out.println("You grab a rock.");
        System.out.println("You look at your target.");
        System.out.println("You are prepared to throw.");
        int num = (int)(Math.random()*100 + 1);
        if (num <= 5)
        {
            System.out.println("You missed =(");
            rockAmount --;
        }
        else
        {
            System.out.println("You hit them!");
            System.out.println("25 Damage.");
            rockAmount --;
        }
        System.out.println("You now have " + rockAmount + " left.");
        System.out.println();
    }
    
    public boolean parry()
    {
        return false;
    }
}
