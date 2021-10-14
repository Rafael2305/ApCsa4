
/**
 * Write a description of class ForLoop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ForLoop
{
    public static void loop(){
        for (int i = 1; i < 6; i++){
            Integer num = (Integer) i;
            String num2 = num.toString();
            System.out.print((num2) + (num2) + (num2) + (num2) + (num2));
        }
    }
    public static void betterLoop(){
        for (int i = 1; i < 6; i++){
            for (int ii = 1; ii < 6; ii++){
                System.out.print(ii);
            }
            System.out.println();
        }
    }
}