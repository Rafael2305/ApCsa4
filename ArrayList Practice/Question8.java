
/**
 * Write a description of class Question8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Question8
{
    ArrayList<Integer> a;
    ArrayList<Integer> b;
    ArrayList<Integer> c;
    public Question8 ()
    {
        a = new ArrayList<Integer>();
        b = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
             a.add((2 * i) + 1);
        }
        for(int i = 0; i < 11; i++)
        {
            b.add(20 - (2 * i));
        }
    }
    public void mergeLists()
    {
        c = new ArrayList<Integer>();
        for(int i = 0; i < 11; i++){
            if(a.get(i) < b.get(10 - i))
            {
                c.add(a.get(i));
                c.add(b.get(10 - i));
            }
            else if(a.get(i) > b.get(10 - i))
            {
                c.add(b.get(10 - i));
                c.add(a.get(i));
            }
        }
    }
}
