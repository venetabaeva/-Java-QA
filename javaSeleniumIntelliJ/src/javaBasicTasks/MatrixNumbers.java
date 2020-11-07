package javaBasicTasks;

import java.util.Scanner;

public class MatrixNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * reads from the console a positive integer number N 
		 * prints a matrix 
		 * use two nested loops
		 */
		
		Scanner sc = new Scanner(System.in);
	 	int n = sc.nextInt();
		int rw;
		int clmn;
		
		
		
		for ( rw = 1; rw <= n; rw++) {
			
			System.out.print(rw);

			for ( clmn = rw +1; clmn <= rw + n - 1;) {
				
				System.out.print(clmn);
				clmn++;
			}
			System.out.println();
			
	}
		
}
}
