
/**
 * Write a description of class Question5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Question5
{
    ArrayList<Integer> storage; 
    public Question5()
    {
        storage = new ArrayList<Integer>();
        for(int i = 0; i < 5; i++)
        {
             storage.add(i);
        }
    }
    public void reverse()
    {
        ArrayList<Integer> numArr = new ArrayList<Integer>();
        for(int num: storage)
        {
            numArr.add(0, num);
        }
        storage = numArr; //numArr becomes temp
    }
}
