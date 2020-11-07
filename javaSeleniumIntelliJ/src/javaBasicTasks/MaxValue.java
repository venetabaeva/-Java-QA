package javaBasicTasks;

import java.util.Scanner;

public class MaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * a program that finds the maximum number from a given sequence
		 */
		
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double nn = 0;
		double max = 1;
	 	
		
		for (double i = 0; i < n; i++) {
			for (double ii = 0; ii < n; ii++)
				if (ii == i) {
					nn =sc.nextDouble();
					if (nn > max) {
						max = nn;
					}
					break;
				}
			
		}
		System.out.printf("%.0f%n",max);
	}
}
