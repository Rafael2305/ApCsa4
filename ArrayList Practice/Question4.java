
/**
 * Write a description of class Question4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Question4
{
    ArrayList<Integer> list1;
    ArrayList<Integer> list2;
    public void inputNum()
    {
        list1 = new ArrayList<Integer>();
        list2 = new ArrayList<Integer>();
        list2.add(0);
        Scanner scanner = new Scanner(System.in);
        int inNum;
        while(list1.size() < 5)
        {
            System.out.println("Input a number:");
            inNum = scanner.nextInt();
            list1.add(inNum);
        }
        for(int i = 0; i < list1.size(); i++)
        {
            list2.set(i, list1.get(i));
        }
    }
}
