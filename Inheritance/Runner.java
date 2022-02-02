
/**
 * Write a description of class Runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Runner
{
    public static void main()
    {
        Car myCar = new KeylessCar();
        Car yourCar = new Car();
        myCar.toggleEngine();
        yourCar.toggleEngine();
        myCar.move();
        myCar.moveBackward();
        System.out.println();
        System.out.println();
        F250 yourNewCar = new F250();
        System.out.println(yourNewCar.pain());
        
        ArrayList<DriverlessCar> newLane = new ArrayList<DriverlessCar>();
        newLane.add(yourNewCar);
        //newLane.add(myCar); This does not work b/c mtCar is not Driverless
        newLane.get(0).move(); //Is this valid? Yes.
        // newLane.get(0).pain(); //Is this valid? No. Pain is not guaranteed.
        
        DriverlessCar myNewCar = new F250();
        // myNewCar.pain(); //Invalid. myNewCar is a DriverlessCar, not F250.
        /*
         * //Is this valid?
           Object yourNewCar2 = new KeylessCar(); //Yes :D
           DriverlessCar car = new Car(); //No. Car is not a DriverlessCar
           Object car2 = new DriverlessCar(); //There is no class DriverlessCar!
           KeylessCar car3 = new Object(); //No
        */
    }
}
