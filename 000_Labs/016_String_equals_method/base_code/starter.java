/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Would you like to be a Wizard, Warrior, or a Rouge? : ");
		String ans = sc.nextLine();
		
		if( (ans.equals("Wizard")) || (ans.equals("wizard"))) {
			System.out.println("you chose to be a Wizard!");
		}
		else if( (ans.equals("Warrior")) || (ans.equals("warrior"))){
			System.out.println("you chose to be a Warrior!");
		}
		else if( ( ans.equals("Rouge")) || (ans.equals("rouge"))){
			System.out.println("you chose to be a Rouge!");
		}
		else{
			System.out.print("Please choose an option");
		}
	}
}
