
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
        double avg = (double) getSum() / arr.length;
        return avg;
    }
    public int getLargest(){
        int largest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
}
