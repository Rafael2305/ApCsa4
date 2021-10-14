
/**
 * Write a description of class ArrayPractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayPractice
{
    int[] arr;
    
    public ArrayPractice(int x){
        arr = new int[x];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }
    }
    public int getSum(){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public double getAverage(){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        double avg = sum / arr.length;
        return avg;
    }
    public int getLargest(){
        int biggest = 0;
        for(int i = 0; i < arr.length; i++){
            if (biggest < arr[i]){
                biggest = arr[i];
            }
        }
        return biggest;
    }
}
