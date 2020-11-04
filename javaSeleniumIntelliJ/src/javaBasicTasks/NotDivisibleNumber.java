package javaBasicTasks;

import java.util.Scanner;

public class NotDivisibleNumber {
	static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  reads from the console a positive integer N 
		 *  prints all the numbers from 1 to N not divisible by 3 or 7 on a single line, separated by a space.
		 */

		sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		for (int i = 1;i <= n; i++) {
			if(i % 3 != 0 ) {
				 if(i % 7 != 0 ) {
					 System.out.printf(" %d ",i);
				 }
				
		}
		
	}

}
}

