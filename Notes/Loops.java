
/**
 * Write a description of class Loops here.
 *
 * @author (your name)
 * @version (9-1-21)
 */
public class Loops
{
    public static void countToTen(){
        for (int i = 0; i < 10; i++){
            System.out.println("This number is " + (i+1));
        }
        //System.our.println(i) 
    }
    public static void countToTen2(){
        int i;
        for (i = 1; i < 10; i++){
            System.out.println("This number is " + (i+1));
        }
    }
    public static void countByTwos(){
        for (int i = 2; i < 11; i+=2){
            System.out.println("This number is " + i);
        }
    }
    public static void oddNums(){
        for (int i = 1; i < 10; i+=2){
            System.out.println("This number is " + i);
        }
    }
    public static void adjNums(){
        int a = 10;
        a += 20; // a = a + 20
        a -= 4;// a = a - 4
        a *= 8;// a = a * 8
        a /= 16;// a = a / 16
        a %= 2;// a = a % 2
    }
    /**This method converts a number of minutes into hours and minutes.
     * 
     * @ param minutes The number of total minutes (int)
     */
    public static void timeConverter(int minutes){
        int hours = minutes / 60;
        int minutesLeft = minutes % 60;
        System.out.println("That is " + hours + " hours and " + minutesLeft + (" minutes Left"));
    }
    public static void convertAll(){
        for (int i = 0; i < 200; i += 15){
            timeConverter(i);
        }
    }
    public static void convertAllTheThings(){
        int i = 0; //This is the iterator (declare and initialize)
        while (i < 1000){ //Need a stopping point
            timeConverter(i);
            i++; //change the iterator
        }
    }
    
    /* When your first run a loop:
     * 
     * Use a for loop when you know exactly when it stops
     * Use a while loop when you don't.
     */
     
    
}