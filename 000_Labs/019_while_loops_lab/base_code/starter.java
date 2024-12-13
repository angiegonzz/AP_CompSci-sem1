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
		
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter how many times you want your name to be printed out: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		while(number == number){
			System.out.print(name);
			name = name;
			break;
			
		}
	}
}
