
/**
 * Write a description of class Blackjack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Blackjack
{
    public static void game(){
        Hand player = new Hand();
        Hand dealer = new Hand();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your first card is: " + player.getCard1());
        System.out.println("Your second card is: " + player.getCard2());
        System.out.println("Your total is: " + player.getTotal());
        System.out.println();
        System.out.println("Dealer's first card is: " + dealer.getCard1());
        System.out.println();
        String hitOrStay = "";
        while (player.getTotal() <= 21 && !hitOrStay.equals("Stay")){
            System.out.println("Hit or Stay?");
            hitOrStay = scanner.next();
            if (hitOrStay.equals("Hit")){
                player.hit();
                System.out.println("Your total is now " + player.getTotal());
                if (player.getTotal() >=22){
                    System.out.print("You busted, game over.");
                }
            }
        }
        while (dealer.getTotal() <= 16 && player.getTotal() < 22){
            dealer.hit();
            System.out.println("Dealer's total is now " + dealer.getTotal());
        }
        if (player.getTotal() >= 22){
            System.out.println();
        } else if (dealer.getTotal() >= 22)
            System.out.println("Dealer busted, you won!");
        else if (dealer.getTotal() == player.getTotal()){
            System.out.print("Draw");
        } else if (dealer.getTotal() > player.getTotal())
            System.out.println("Dealer wins");
        else if (dealer.getTotal() < player.getTotal()){
            System.out.println("You win");
        }
    }
}