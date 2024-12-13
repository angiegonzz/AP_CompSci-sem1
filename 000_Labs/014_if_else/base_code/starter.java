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
		
		System.out.print("Guess a number between 1 and 1000: ");
		int ans = sc.nextInt();
		sc.nextLine();
		
		boolean a = ans == 500;
		boolean b = ans > 500;
		boolean c = ans < 500;
		
		if(a){
			System.out.println("you're correct!");
		}
		else if(b){
			System.out.println("you guessed higher than the number");
		}
		else if(c){
			System.out.println("you guessed lower than the number");
		}
		
	
	}
}
