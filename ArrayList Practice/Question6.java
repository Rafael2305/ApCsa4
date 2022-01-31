
/**
 * Write a description of class Question6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.lang.Math;
public class Question6
{
    ArrayList<Integer> numArr;
    int largest;
    int smallest;
    public Question6()
    {
        numArr = new ArrayList<Integer>();
        for(int i = 0; i < 11; i++)
        {
            int ranNum = (int)(Math.random() * 20 + 1);
            numArr.add(ranNum);
        }
    }
    public void bigAndSmall()
    {
        largest = numArr.get(0);
        smallest = numArr.get(0);
        for(int num : numArr)
        {
            if(num > largest)
            {
                largest = num;
            }
            if(num < smallest)
            {
                smallest = num;
            }
        }
    }
}
