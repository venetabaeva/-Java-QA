package javaBasicTasks;

import java.util.Scanner;

public class FindLargestThreeValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 *  finds the three largest numbers in a sequence
		 *  prints them in descending order in the following format
		 */
		Scanner sc = new Scanner(System.in);
		double n = sc.nextInt();
		double nn = 0;
		double max1 = 0;
		double max2 = 0;
		double max3 = 0;
		
		for (double i = 0; i < n; i++) {
			for (double ii = 0; ii < n; ii++)
				if (ii == i) {
					nn =sc.nextInt();
					if (nn > max1) {
						max3 = max2;
						max2 = max1;
						max1= nn;
						}  if (nn > max2 && nn != max1) {
						max3 = max2;
						max2 = nn;
						}  if (nn > max3 && nn != max1 && nn != max2) {
						max3 = nn;
						}
					break;
				}
			
		}
		System.out.printf("%.0f, ",max1);
		System.out.printf("%.0f and ",max2);
		System.out.printf("%.0f ",max3);
	}
}

