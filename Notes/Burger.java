
/**
 * Write a description of class Burger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Burger
{
    // 5 fields
    private String buns;
    private String patty;
    private boolean hasLettuce;
    private boolean hasMayo;
    private String drink;
    
    //2 constructors
    public Burger(String bunsType, String pattyType, boolean wantLettuce,boolean wantMayo, String drinkType){
        buns = bunsType;
        patty = pattyType;
        hasLettuce = wantLettuce;
        hasMayo = wantMayo;
        drink = drinkType;
    }
    public Burger(){
        buns = "Seaseme seed";
        patty = "Beef";
        hasLettuce = true;
        hasMayo = false;
        drink = "Pineapple juice";
    }
    
    //mutator methods
    public void changeBuns(String newBuns){
        buns = newBuns;
    }
    public void changePatty(String newPatty){
        patty = newPatty;
    }
    public void trollLettuce(){
        if (hasLettuce){
            hasLettuce = false;
        } else {
            hasLettuce = true;
        }
    }
    public void trollMayo(){
        if (hasMayo){
            hasMayo = false;
        } else {
            hasMayo = true;
        }
    }
    public void changeDrink(String newDrink){
        drink = newDrink;
    }
    
    //accessor methods 
    public String getBuns(){
        return buns;
    }
    public String getPatty(){
        return patty;
    }
    public boolean currentLectuce(){
        return hasLettuce;
    }
    public boolean currentMayo(){
        return hasMayo;
    }
    public String getDrink(){
        return drink;
    }

    //additional methods
    public Burger(String buns){
        this("Steel", "turkey", false, true, "Soy milk");
    }
    public void sadMeal(){
        buns = "Single bun";
        patty = "none";
        hasLettuce = false;
        hasMayo = false;
        drink = "Your tears";
    }
    public void wrongOrder(){
        trollLettuce();
        trollMayo();
    }
}
