
/**
 * Write a description of class TheStickOfDeath here.
 *
 * A stick brought from the world of Minecraft, enchanted to the max.
 */
public class TheStickOfDeath extends Weapon
{
    public TheStickOfDeath(String name)
    {
        super(name, 100, 50, 5);
    }
    
    public void attack()
    {
        System.out.println("You feel the power surging through your body.");
        System.out.println("The world starts to shake and tremble.");
        System.out.println("You strike with all your might.");
        System.out.println();
        System.out.println("50 damage (still a stick after all) :,(");
        weaponDurability += 5;
        System.out.println("Weapon Durability + 5, this stick becomes harder to break the more it is used.");
        System.out.println();
    }
    public boolean parry()
    {
        return true;
    }
}
