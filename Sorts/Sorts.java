
/**
 * Write a description of class BubbleSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sorts
{
    int[] sortList = {9, 3, 1, 5, 7, 2, 4, 5};
    int memory;
    int limit;
    public void bubbleSort()
    {
        limit = sortList.length - 1;
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

    public void SelectionSort()
    {
        limit = 0;
        while(limit < sortList.length - 1)
        {
            int smallestSoFar = sortList[limit];
            int smallestIndex = limit;
            //Find smallest num
            for(int i = limit; i < sortList.length; i++)
            {
                if(sortList[i] < smallestSoFar)
                {
                    smallestSoFar = sortList[i];
                    smallestIndex = i;
                }
            }
            memory = sortList[smallestIndex];
            sortList[smallestIndex] = sortList[limit];
            sortList[limit] = memory;

            limit++;
        }
    }

    public void insertionSort()
    {
        int greenNum = sortList.length - 7;
        while(greenNum > sortList.length)
        {
            for(int i = 0; )
            {
                if(sortList[i] < sortList[] || greenNum == 0)
                {
                    
                }
                else if(sortList[i] >= sortList[greenNum])
                {
                    
                }

            }
            greenNum++;
        }
    }
}
