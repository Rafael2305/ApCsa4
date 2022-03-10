
/**
 * Write a description of class Recursion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recursion
{
    //Must haves
    // - stopping method
    // - calling themselves
    public static void countdown(int n)
    {
        System.out.println(n);
        if (n > 0)
        {
            countdown(n - 1);
        }
    }
    
    // 1) Add num the numbers until N.
    public static int challenge1(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        else
        {
            return n + challenge1(n - 1);
        }
    }
    
    // 2) Factorial!
    public static int challenge2(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        else
        {
            return n * challenge2(n - 1);
        }
    }
    
    // 3) Method for multiplication with only + or -.
    public static int challenge3(int a, int b)
    {
        if(a == 0 || b == 0)
        {
            return 0;
        }
        else
        {
            return a + challenge3(a, b - 1);
        }
    }
}
