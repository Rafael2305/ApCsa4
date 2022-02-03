
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
    int amount;
    public Item(String name)
    {
        itemName = name;
    }

    public String getName(){
        return itemName;
    }
}
