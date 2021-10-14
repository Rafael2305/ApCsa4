
/**
 * Write a description of class HelloWorld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hello{
    //Original
    public static void main(String[] args){
        System.out.println("Pineapple");
    }

    //New
    public static void nameOfMethod(String[] args){
        System.out.println(5);
    }

    public static void thingy(){
        int a; //Declaration - a is an integer - Creates memoy space
        a = 5; //Instantiation - a is set to 5
        System.out.println(a); //print a
    }
    
    public static void thingy2(){
        String a; //Declaration - a is a type string
        a = "Bob"; //Instantiation - a is set to "Bob"
        System.out.println(a);
    }
    
    public static void test(){
        System.out.print("I do not fear computers. ");
        System.out.println("I fear the lack of them.");
        System.out.println("--Isaac Asimov");
    }
}