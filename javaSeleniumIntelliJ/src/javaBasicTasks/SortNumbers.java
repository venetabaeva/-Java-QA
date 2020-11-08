package javaBasicTasks;

import java.util.Scanner;

public class SortNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * reads a list of numbers separated by a comma and space
		 *  arrange the numbers in descending order
		 *  output all numbers on a single line, separated by a comma and a space
		 */

		Scanner sc = new Scanner(System.in);
	
		
		String s = sc.nextLine();
		String[] ss = s.split(", ");
		int[] ii = new int[ss.length];
		String[] iiOut = new String[ii.length];
		int temp;

		for (int i = 0; i < ii.length; i++) {
			ii[i] = Integer.parseInt(ss[i]);
		}
		for (int i = 0; i < ii.length; i++) {
			for (int j = i + 1; j < ii.length; j++) {

				if (ii[i] < ii[j]) {
					temp = ii[i];
					ii[i] = ii[j];
					ii[j] = temp;

				}
				
			}
			iiOut[i] = Integer.toString(ii[i]);
		}

		String out = String.join(", ", iiOut);
		System.out.print(out);
	}

}
