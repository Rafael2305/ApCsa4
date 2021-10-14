
/**
 * Write a description of class GuessGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.lang.Math;
public class GuessGame
{
    /*GuessGame Requirements
     * Compueter generates a random number from 1 to 50
     * You get 15 tries to guess the number.
     * After each guess, the computer will tell you to guess higher or lower.
     * The program ends when guesses have run out or if you guessed correctly
     */
    public static void main(){
        int numGuess = 0;
        int num = (int)(Math.random()*50 + 1);
        Scanner scanner = new Scanner(System.in);
        while (numGuess < 15){
            System.out.println("Guess the number: ");
            int guessNum = scanner.nextInt();
            numGuess++;
            if(guessNum > num){
                System.out.println("Lower");
            } else if(guessNum < num){
                System.out.println("Higher");
            } else {
                System.out.println("Correct");
                numGuess += 15;
            }
        }
    }
}