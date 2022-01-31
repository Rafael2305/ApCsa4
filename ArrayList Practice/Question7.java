
/**
 * Write a description of class Question7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Question7
{
    ArrayList<Integer> arr;
    public void inputNum()
    {
        arr = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int inNum;
        //a
        while(arr.size() < 10)
        {
            System.out.println("Input a number:");
            inNum = scanner.nextInt();
            arr.add(inNum);
        }
        //b
        System.out.println();
        System.out.println("Your numbers are: ");
        for(int i = 0; i < arr.size(); i++)
        {
            System.out.println(arr.get(i));
        }
    }
    //c
    public int searchNum(int value)
    {
        for(int i = 0; i < arr.size(); i++)
        {
            if(arr.get(i) == value)
            {
                return i;
            }
        }
        return -1;
    }
    //d
    int memory;
    int limit;
    public void bubbleSort()
    {
        limit = arr.size() + 1;
        while(limit >= 0)
        {
            for(int i = 0; i < limit; i++)
            {
                if(arr.get(i) >= arr.get(i + 1))
                {
                    memory = arr.get(i);
                    arr.set(i, arr.get(i + 1));
                    arr.set(i + 1, memory); 
                }
            }
            limit--;
        }
    }
}
