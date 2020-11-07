package javaBasicTasks;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * calculate the discounted price for each item discount is 65%
		 */

		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double nn = 0;
		double d = (1 - 0.65);


		for (double i = 0; i < n; i++) {
			for (double ii = 0; ii < n; ii++)
				if (ii == i) {
					nn =sc.nextDouble();
					nn*=d; 
					continue;
				}
			System.out.printf("%.2f%n",nn);
		}

		
		
		
}

}
	

