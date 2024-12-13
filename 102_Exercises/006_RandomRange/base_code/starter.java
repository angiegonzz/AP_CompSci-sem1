/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.print("enter an integer: ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter another integer (Bigger than the first): ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("your range is " + num1 + " to " + num2);
		System.out.println("here are five numbers generated in that range: ");
		
		int a = (int) (Math.random() * (num2 - num1)) + num1;
		System.out.print(a);
		System.out.print(", ");
		
		int b = (int) (Math.random() * (num2 - num1)) + num1;
		System.out.print(b);
		System.out.print(", ");
		
		int c = (int) (Math.random() * (num2 - num1)) + num1;
		System.out.print(c);
		System.out.print(", ");
		
		int d = (int) (Math.random() * (num2 - num1)) + num1;
		System.out.print(d);
		System.out.print(", ");
		
		int e = (int) (Math.random() * (num2 - num1)) + num1;
		System.out.print(e);
		
		
		
		
	}
}
