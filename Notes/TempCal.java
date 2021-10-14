
/**
 * Write a description of class TempConv here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TempCal
{
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature:");
        double ogTemp = scanner.nextDouble();
        System.out.println("Type C for Celsius and F for Fahrenheit");
        String typeTemp = scanner.next();

    }
}