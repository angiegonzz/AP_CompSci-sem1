/* 
    Lecture note example - Input and Scanner
*/

import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your name");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        
        
        
        
        System.out.println("enter a number");
        int number1 = sc.nextInt();
        sc.nextLine();
        
        System.out.println("enter a second number");
        int number2 = sc.nextInt();
        sc.nextLine();
        
        System.out.println("the sum of these numbers is: " + (number1 + number2));
        
        
        
        
        System.out.println("enter your favorite food");
        String food = sc.nextLine();
        
        
        
	}
}