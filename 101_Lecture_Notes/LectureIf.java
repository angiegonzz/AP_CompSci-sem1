/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;


class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        System.out.println("We are going to the beach");
        System.out.println("How would you like to start your trip?: ");
        System.out.println("1. Pack a Picnic");
        System.out.println("2. Grab your surfboard");
        System.out.println("3. Invite your friends");
        
        int ans = sc.nextInt();
        if(ans == 1){
            System.out.println("You gather snacks, drinks, and a blanket, ready to enjoy a relaxing day by the waves.");
        }
        else if(ans == 2){
            System.out.println("Excited to catch some waves, you pack myour surfboard and head to the beach for an adrenaline-filled day.");
        }
        else if(ans == 3){
            System.out.println("you decide to make it a group outing and invte your friends for a fun day in the sun.");
            System.out.println("After sending a group text, everyone eagerly agrees to join. You arrange to meet at your favorite beach at noon.");
            System.out.println("As you arrive, you see your friends setting up a spot on the sand. They’ve brought umbrellas, games, and plenty of snacks.");
            System.out.println("now you have to choose what you'd like to do first");
            System.out.println("1. Play beach volleyball");
            System.out.println("2. Set up relaxation zone");
            System.out.println("3. Explore the shroeline");
            
            int ans2 = sc.nextInt();
            if(ans2 == 1){
                System.out.println("you and your friends play beach volleyball and ")
            }
            
        }
        else{
            System.out.print("pick a number 1-3");
        }
        
        
        
        
        
	}
}