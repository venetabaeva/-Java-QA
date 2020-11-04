package javaBasicTasks;

import java.util.Scanner;

public class NumbersFromOnetoN {
	static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * enters from the console a positive integer n prints all the numbers from 1 to
		 * N inclusive, on a single line, separated by a whitespace
		 */

		sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		

		for (int i = 1;i <= n; i++) {
			System.out.printf(" %d ",i);
			
			
		}
		
	}

}
