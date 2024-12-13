/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);

	System.out.print("Guess a number between 1 and 1000: ");
	int guess = sc.nextInt();
	sc.nextLine();
		
	while(true){
		if(guess == 500){
			System.out.print("you got it right!");
			break;
			}
		else if(guess > 500){
			System.out.print("Guess a lower number");
			guess = sc.nextInt();
			sc.nextLine();
			}
		else if(guess < 500){
			System.out.print("Guess a higher number");
			guess = sc.nextInt();
			sc.nextLine();
			}
			
		}

	}
}
