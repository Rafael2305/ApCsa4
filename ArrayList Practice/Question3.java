
/**
 * Write a description of class Question3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Question3
{
    ArrayList<Integer> numArray;
    public void inputNum()
    {
        numArray = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int inNum;
        while(numArray.size() < 10)
        {
            System.out.println("Input a number:");
            inNum = scanner.nextInt();
            numArray.add(inNum);
        }
        for(int i = 0; i < numArray.size(); i++)
        {
            sum += numArray.get(i);
        }
        System.out.println("The sum of all the numbers together are: "+ sum);
    }
}
