
/**
 * Write a description of class BubbleSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BubbleSort
{
    int[] sortList = {9, 3, 1, 5, 7, 2, 4, 5};
    int memory;
    public void sort()
    {
        int limit = sortList.length - 1;
        while(limit >= 0)
        {
            for(int i = 0; i < limit; i++)
            {
                if(sortList[i] >= sortList[i + 1])
                {
                    memory = sortList[i];
                    sortList[i] = sortList[i + 1];
                    sortList[i + 1] = memory; 
                }
            }
            limit--;
        }
    }
}
