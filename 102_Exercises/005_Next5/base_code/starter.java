/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("please enter a number: ");
	int num = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Here are the next 5 numbers: ");
	System.out.print(num + 1);
	System.out.print(" ");
	System.out.print(num + 2);
	System.out.print(" ");
	System.out.print(num + 3);
	System.out.print(" ");
	System.out.print(num + 4);
	System.out.print(" ");
	System.out.println(num + 5);
	
	System.out.println("Here are the next 5 multiples");
	System.out.print(num * 1);
	System.out.print(" ");
	System.out.print(num * 2);
	System.out.print(" ");
	System.out.print(num * 3);
	System.out.print(" ");
	System.out.print(num * 4);
	System.out.print(" ");
	System.out.println(num * 5);
	
	double num2 = 100;
	System.out.println("Here is " + num + " divided by " + num2 );
	System.out.println(num/num2);
	
	double num3 = 10;
	System.out.println("Here is" + num+ " divided by " + num3);
	System.out.print(num/num3);
	
	
	
	
	
	}
}
