package javaTelerick;

import java.util.Scanner;

/*
 * Input: calculate the average of a collection of values
 * Ouptut:printed with two digits after the decimal point
 */
public class FindAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double values = Integer.parseInt(sc.nextLine());

		double tot = 0;
		double avrg = 0;
		

	
		for(double i = 0;i< values; i++)
			{
			for(double ii = 0;ii< values; ii++)
				if (ii==i) {
					tot +=sc.nextDouble();
					avrg= tot/values;
					break;
				}
			
			}
			System.out.printf("%.2f",avrg);
	}
		
	}


