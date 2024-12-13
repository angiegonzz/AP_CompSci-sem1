/* 
    Lecture note example - Classes
*/
import pkg.*;
import java.util.*;

class starter{
    public static void main(String args[]) {
        potato fry = new potato();
        boolean x = fry.getEdibility();
        System.out.print(x);
        potato sp = new potato("blue", "baked", 100);
        System.out.print(sp.getEdibility());
        sp.eatpotato();
        }
}