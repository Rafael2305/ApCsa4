
/**
 * Write a description of class Weapon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Weapon extends Item implements WeaponInterface
{
    int weaponDamage;
    int weaponDurability;
    public Weapon(String name, String rarity, int damage, int durability)
    {
        super(name, rarity);
        weaponDamage = damage;
        weaponDurability = durability;
    }
    
    public void attack()
    {
        System.out.println("You atack with: " + itemName);
        System.out.println(itemName + " does " + weaponDamage + " damage.");
        weaponDurability--;
    }
    
    public int getDurability()
    {
        return weaponDurability;
    }
}
