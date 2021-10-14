
/**
 * Write a description of class ReadingInput here.
 *
 * @author (Rafael)
 * @version (8.24.21)
 */
import java.util.Scanner;  //We are using it, but not on AP test
public class ReadingInput
{
    public static void main(){
        int a = 10;
        
        Scanner scanner; //Declaration
        scanner = new Scanner(System.in); // Instantiation 
        
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println("Hello " + name);
        System.out.println("What is your quest?");
        String quest = scanner.next();
        System.out.println("What is you favorite color?");
        String color = scanner.next();
    }
    
    
    
    
    /** This method uses a scanner to ask for a person's name.
     * 
     */
    public static void inputName(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println("Hello " + name);
    }
    /**Asks the user for an integer and rpints it.
     * 
     */
    public static void aNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your number?");
        int number = scanner.nextInt();
        System.out.println("Your number is " + number);
        int nextNum = number + 1;
        System.out.println("The next number would be " + nextNum);
    }
    public static void aBetterNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your number?");
        int number = scanner.nextInt();
        System.out.println("Your number is " + number);
        number++;
        System.out.println("The next number would be " + number);
        number--;
        System.out.println(number);
    }
}
