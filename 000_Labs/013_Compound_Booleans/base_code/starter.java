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
		
		System.out.print("Please enter an integer: ");
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Please enter another integer: ");
		int b = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Please enter the last integer: ");
		int c = sc.nextInt();
		sc.nextLine();
		
		boolean q = a > b;
		boolean r = a > c;
		boolean s = b > a;
		boolean t = b > c;
		boolean u = c > a;
		boolean v = c > b;
		
		boolean w = a < b;
		boolean x = a < c;
		boolean y = b < a;
		boolean z = b < c;
		boolean j = c < a;
		boolean k = c < b;
		
		if(q){
			if(r){
				System.out.println("Your first number is the greatest out of the three");
			}
		}
		if(s){
			if(t){
				System.out.println("Your second number is the greatest out of the three");
			}
		}
		if(u){
			if(v){
				System.out.println("Your third number is the greatest out of the three");
			}
		}
		if(w){
			if(x){
				System.out.println("Your first number is the smallest out of the three");
			}
		}
		if(y){
			if(z){
				System.out.println("Your second number is the smallest out of the three");
			}
		}
		if(j){
			if(k){
				System.out.println("Your third number is the smallest out of the three");
			}
		}
		
	}
}
