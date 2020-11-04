package javaBasicTasks;

import java.util.Scanner;

public class FindAverage {
	static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * calculate the average of values 
		 * printed with two digits after the decimal point
		 */
		
		float tot = 0f;
		sc = new Scanner(System.in);
		double n = sc.nextDouble();
		
		for(int i = 0;i< n; i++)
		{
			tot +=sc.nextFloat();
		}
		System.out.printf("%.2f",(tot/n));
	}

}