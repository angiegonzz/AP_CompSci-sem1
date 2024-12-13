/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a degree in fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
		double celcius = ((5 * (fahrenheit - 32.0)) / 9.0);
		System.out.println(fahrenheit + " degree in fahrenheit is equal to " + celcius + "in celcius");
		
	}
}
