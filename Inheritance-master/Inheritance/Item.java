
/**
 * Write a description of class Item here.
 * 
 * @author Wiebe 
 * @version 1.2
 */
import java.util.ArrayList;
public class Item implements ItemInterface
{
    //Implemented in your own way
    String itemName;
    String itemRarity;
    public Item(String name, String rarity)
    {
        itemName = name;
        itemRarity = rarity;
    }

    public String getName()
    {
        return itemName;
    }
    public String getRarity()
    {
        return itemRarity;
    }
}
