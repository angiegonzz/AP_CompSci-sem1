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
		
		System.out.println("1. Monday");
		System.out.println("2. Tuesday");
		System.out.println("3. Wednesday");
		System.out.println("4. Thursday");
		System.out.println("5. Friday");
		System.out.println("6. Saturday");
		System.out.println("7. Sunday");
		System.out.print("Please enter an integer 1-7 to choose the day of the week: ");
		int day = sc.nextInt();
		sc.nextLine();
		
		if(day == 1){
			System.out.print("It is monday, 7:00am");
		}
		else if(day == 2){
			System.out.println("It is tuesday, 7:00am");
		}
		else if(day == 3){
			System.out.println("It is Wednesday, 7:00am");
		}
		else if(day == 4){
			System.out.println("It is Thursday, 7:00am");
		}
		else if(day == 5){
			System.out.println("It is Friday, 7:00am");
		}
		else if(day == 6){
			System.out.println("It is Saturday, 10:00am");
		}
		else if(day == 7){
			System.out.println("It is Sunday, 10:00am");
		}
		else{
			System.out.println("erm.......try again.");
		}
		
		
		
	}
}
