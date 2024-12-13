/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman test = new Spiderman("bob");
		test.setAge(32);
		test.setVillain("joe");
		
		Spiderman two = new Spiderman("toby Maguire", 49, "Green Goblin");
		
		Spiderman three = new Spiderman("Andrew Garfield", 41);
		
		three = new Spiderman("Andrew Garfield", 41);
		three.setVillain("Electro");
		
		System.out.println("the villain is " + three.getVillain());
		
		
	}
}
