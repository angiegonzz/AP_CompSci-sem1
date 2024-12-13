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
		
		System.out.print("guess a number 1 - 1000: ");
		int ans = sc.nextInt();
		sc.nextLine();
		
		boolean a = ans == 500;
		boolean b = ans > 500;
		boolean c = ans < 500;
		
		while(true){
			if(a){
				System.out.print("you got it right!");
				break;
			}
			else if(b){
				System.out.print("Guess a lower number");
				break;
			}
			else if(c){
				System.out.print("Guess a higher number");
				break;
			}
		
		}
		ans = sc.nextInt();
		sc.nextLine();
	}
}
