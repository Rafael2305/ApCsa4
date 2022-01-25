
/**
 * Write a description of class Question1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Question1
{
    //a
    ArrayList<Integer> numArray;
    public Question1()
    {
         numArray = new ArrayList<Integer>();
         for(int i = 0; i < 15; i++){
             numArray.add(i);
            }
    }
    //b
    public void getTenthElement()
    {
        int tenth = numArray.get(9);
        System.out.println("The tenth element is: " + tenth);
    }
    //c
    public void setFifthElement35()
    {
        numArray.set(4, 35);
    }
    //d
    public void setNinth()
    {
        int sixthVal = numArray.get(5);
        int thirteenthVal = numArray.get(12);
        int value = sixthVal + thirteenthVal;
        numArray.set(8, value);
    }
}
