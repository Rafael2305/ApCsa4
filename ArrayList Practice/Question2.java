
/**
 * Write a description of class Question2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Question2
{
    //a
    ArrayList<String> weekList;
    public Question2()
    {
        weekList = new ArrayList<String>();
        weekList.add("Sunday");
        weekList.add("Monday");
        weekList.add("Tuseday");
        weekList.add("Wednesday");
        weekList.add("Thursday");
        weekList.add("Friday");
        weekList.add("Saturday");
    }
    //b
    public void display()
    {
        System.out.println("The days of the week:");
        for(int i = 0; i < weekList.size(); i++)
        {
            System.out.println(weekList.get(i));
        }
    }
}
