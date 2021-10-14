
/**
 * Write a description of class PencilCharpenerTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PencilCharpenerTester
{
    public static void main(){
        PencilSharpener mySharpener = new PencilSharpener();
        PencilSharpener yourSharpener = new PencilSharpener ("Stell", "red", "Swingline", 100.6, 5);
        System.out.println("I throw my pencil sharpener.");
        String result = mySharpener.throwSharpener();
        System.out.println(result);
        
        System.out.println("I throw my pencil sharpener again.");
        System.out.println(mySharpener.throwSharpener());
        System.out.println("This is my " + mySharpener.getBrand() + " sharpener.");
    }
}
