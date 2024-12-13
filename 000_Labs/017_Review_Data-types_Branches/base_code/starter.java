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
		
		System.out.print("What is your name?: ");
		String name = sc.nextLine();
		
		System.out.print("What is your title?: ");
		String title = sc.nextLine();
		
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
		
		int joe = 20;
		System.out.println("You have 20 points to spend, pick 2 traits from the following traits: ");
		System.out.println("1.) Strength - buff and able to carry larger items (10 points)");
		System.out.println("2.) Dexterity - Agile and moves quick (8 points)");
		System.out.println("3.) Intelligence - Better at magic spells (6 points)");
		System.out.println("4.) Charisma - how personable (5 points)");
		int trait = sc.nextInt();
		sc.nextLine();
		
		while(true){
			if(trait == 1){
			joe = joe - 10;
			System.out.println("Your chose strength you now have " + joe + " points left");
			System.out.print("Select another trait: ");
			trait = sc.nextInt();
			}
			
			if(trait == 2){
			joe = joe - 8;
			System.out.println("Your chose strength you now have " + joe + " points left");
			System.out.print("Select another trait or select 5 if done: ");
			trait = sc.nextInt();
			}
			
			if(trait == 3){
			joe = joe - 6;
			System.out.println("Your chose strength you now have " + joe + " points left");
			System.out.print("Select another trait or select 5 if done: ");
			trait = sc.nextInt();
			}
			
			if(trait == 4){
			joe = joe - 5;
			System.out.println("Your chose strength you now have " + joe + " points left");
			System.out.print("Select another trait or select 5 if done: ");
			trait = sc.nextInt();
			}
			else if(trait == 5){
				System.out.println("Your name is " + name + ", your title is " + title + ", and you have " + joe + " left!");
				break;
			}
			else{
				System.out.print("please select a trait 1 - 4");
				trait = sc.nextInt();
			}
				
			
		}
	}
}
