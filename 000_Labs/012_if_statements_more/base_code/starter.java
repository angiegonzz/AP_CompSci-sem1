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
		
		System.out.print("Input one integer: "); 
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Input another integer: ");
		int b = sc.nextInt();
		sc.nextLine();
		
		boolean x = a >= b;
		boolean y = a <= b;
		
		if(x){
			System.out.print(a + " is greater than or equal to " + b);
		}
		else if(y){
			System.out.print(a + " is less than or equal to " + b);
		}
		else{
			System.out.print("Please try again");
		}
	}
}
