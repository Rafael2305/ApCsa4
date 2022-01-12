
/**
 * Write a description of class ArrayListNotes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class ArrayListNotes
{
    ArrayList<String> shoppingList;
    public ArrayListNotes()
    {
        shoppingList = new ArrayList<String>();
        shoppingList.add("Eggs");
        shoppingList.add("Milk");
    }
    public void addMilk()
    {
        shoppingList.add("Milk");
    }
    // public void addThing()
    // {
        // shoppingList.add(1);
    // }
    public String getFirstLetter(int index)
    {
        String item = shoppingList.get(index);
        return item.substring(0,1);
    }
}
