
/**
 * Write a description of class TaxCal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TaxCal
{
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your gross income:");
        double grossIn = scanner.nextDouble();
        System.out.println("Enter the number of dependents:");
        int dep = scanner.nextInt();
        double netIn = grossIn - 10000;
        double taxIn = netIn - (dep * 2000);
        double inTax = taxIn * 0.2;
        System.out.println("The income tax is $" + inTax);
    }
}
