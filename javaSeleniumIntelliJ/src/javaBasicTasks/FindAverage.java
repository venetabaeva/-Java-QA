package javaBasicTasks;

import java.util.Scanner;

public class FindAverage {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * calculate the average of values 
		 * printed with two digits after the decimal point
		 */
		
		
		Scanner sc = new Scanner(System.in);
		double n = sc.nextInt();
		double tot = 0;
		double avrg = 0.00;
		
	
		for(double i = 0;i< n; i++)
			{
			for(double ii = 0;ii< n; ii++)
				if (ii==i) {
					tot +=sc.nextDouble();
					avrg= tot/n;
					break;
				}
			
			}
		System.out.printf("%.2f",avrg);
		
		//optional
		
//		for(int i = 0;i< n; i++)
//		{
//			tot +=sc.nextFloat();
//		}
//		
//		
//		System.out.printf("%.2f",(tot/n));
	}

}