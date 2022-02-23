
/**
 * Write a description of class Weapon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Weapon extends Item
{
    int weaponDamage;
    int weaponDurability;
    public Weapon(String name, int rarity, int damage, int durability)
    {
        super(name, rarity);
        weaponDamage = damage;
        weaponDurability = durability;
    }
    
    public void attack()
    {
        System.out.println("You atack with: " + itemName);
        weaponDurability -= 5;
        
    }
}
