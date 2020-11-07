package javaBasicTasks;

import java.util.Scanner;

public class ConvertNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * convert from Celsius to their Fahrenheit split the list of values and then
		 * iterate over them
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		int i;
		int C =0;
		int F = 0;
		String s = sc.nextLine();
		String[] str = s.split(" ");

		for (i = 0; i < str.length; i++) {
			C = Integer.parseInt(str[i]);
			

					F = ((C * 9 / 5) + 32);
					System.out.println(F);
					System.out.println("");
			
			sc.close();
		}

	}
}