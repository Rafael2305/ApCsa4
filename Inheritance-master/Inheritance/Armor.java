
/**
 * Abstract class Armor - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Armor extends Item implements DefenseCommands
{
    int armorProtection;
    //protection increases by 10% every rarity (starts at 60 -> 100)
    int armorDurability;
    // increase by 50 every rarity (Starts at 50 -> )
    int armorFailure;
    // decreases by 5% every rarity (common, uncommon, rare, epic, legendary) from 
    public Armor(String name, String rarity, int protection, int durability, int fail)
    {
        super(name, rarity);
        armorProtection = protection;
        double blockPercentage = protection / 100;
        armorDurability = durability;
        armorFailure = fail;
    }
    
    public boolean blocked()
    {
        int num = (int)(Math.random()*100 + 1);
        if (num <= armorFailure)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
