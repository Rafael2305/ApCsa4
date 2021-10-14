
/**
 * Write a description of class Hand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class Hand
{
    private int total;
    private int card1;
    private int card2;
    public Hand(){
        card1 = (int)(Math.random()*8 + 2);
        card2 = (int)(Math.random()*8 + 2);
        total = card1 + card2;
    }
    public int getTotal(){
        return total;
    }
    public int getCard1(){
        return card1;
    }
    public int getCard2(){
        return card2;
    }
    public int hit(){
        total = total + (int)(Math.random()*8 + 2);
        return total;
    }
}
