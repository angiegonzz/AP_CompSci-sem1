/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your first name: ");
		String n = sc.nextLine();
		System.out.println("hello " + n);
		
		System.out.println("Enter your age: ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println( num + " is pretty old...");
		
		System.out.println("What month were you born in: ");
		String m = sc.nextLine();
		System.out.println("I was born in " + m + " too!: ");
		
		System.out.println("What day were you born: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println(num2 + " is a pretty unlucky number...yikes!: ");
		
		System.out.println("What is your birth year: ");
		int num3 = sc.nextInt();
		sc.nextLine();
		System.out.println(num3 + " was like foreverrrr ago!!");
		
		System.out.println("how much is a buck fifty: ");
		double num4 = sc.nextDouble();
		sc.nextLine();
		System.out.print("a " + num4 + " is correct!");
		
		
	}
}
