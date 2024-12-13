/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int [] arr = new int[100];
		arr[0] = 4;
		arr[1] = 6;
		arr[2] = 2;
		arr[3] = 8;
		arr[4] = 1;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < ; i++){
			if(arr[i] < min){
				min = arr[i];	
			}
		}
		System.out.println(min);
		
		
		/*
		public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;

        System.out.println("Average: " + average);
        */
	}
}
