/* 
    Lecture note example - Classes
*/
package pkg;

public class potato{
    //Global Variables
    String color;
    boolean isEdible;
    String type;
    double mass;
    
    //Constructors
    public potato(){
        color = "brown";
        isEdible = true;
        type = "french fry";
        mass = 170.5;
    }
    
    public potato(String c, String t, double m){
        color = c;
        isEdible = false;
        type = t;
        mass = m;
    }
    
    //Methods
    public boolean getEdiblity(){
        return isEdible;
    }
}