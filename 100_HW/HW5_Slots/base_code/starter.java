/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("I love to learn coding remotely."); 
				Scanner sc = new Scanner(System.in);
		int input = 0;
		
		int monyon = 100;
		System.out.print("You have $100, would you like to bet money?: ");
		String ans = sc.nextLine();
		
		int roll = (int) (Math.random() * 10 + 1);
		int roll2 = (int) (Math.random() * 10 + 1);
		int roll3 = (int) (Math.random() * 10 + 1);
		
		
		if(ans.equals("YES") || ans.equals("Yes") || ans.equals("yes") || ans.equals("Y") || ans.equals("y")){
			System.out.print("how much money would you like to bet?: ");
			input = sc.nextInt();
				
				if(input > monyon){
					System.out.print("input a smaller number: ");
					input = sc.nextInt();
				}
		}
				else if(ans.equals("NO") || ans.equals("No") || ans.equals("N") || ans.equals("no") || ans.equals("n")){
				System.out.print("mkay bye! you have $" + monyon + " dollars left");
				break;
				}
				
		else if(input < monyon){
			System.out.print(" " + roll + " " + roll2 + " " + roll3 + " ");
			
		if((roll == roll2) && (roll2 == roll3)){
			monyon = monyon + input * 3;
			System.out.print("you have $" + monyon + " dollars :p");
			}
			
		else if (roll == roll2) {
			monyon = monyon + input * 2;
			System.out.print("you now have $" + monyon + " dollars ;p");
			}
			
		else if (roll == roll3) {
			monyon = monyon + input * 2;
			System.out.print("you now have $" + monyon + " dollars ;p");
			}
			
		else if (roll2 == roll3) {
			monyon = monyon + input * 2;
			System.out.print("you now have $" + monyon + " dollars ;p");
			}
			
		else{
			monyon = monyon - input;
				System.out.print("you now have $" + monyon + "dollars :(");
			}
		}
	}
}