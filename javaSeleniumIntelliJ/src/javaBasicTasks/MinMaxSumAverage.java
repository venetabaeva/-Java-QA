package javaBasicTasks;

import java.util.Scanner;

public class MinMaxSumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * reads from the console a sequence of N real numbers returns the minimal, the
		 * maximal number, the sum and the average of all numbers
		 */

		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();// 1 <= N <= 1000
		double nn = 0;
		double min = 1;// 1000000;
		double max = 0;// -1000000;
		double sum = 0;
		double avg = 0.00;

		for (double i = 0; i < n; i++) {
			for (double ii = 0; ii < n; ii++)
				if (ii == i) {
					nn =sc.nextDouble();
					if (nn > max) {
						max = nn;
					}
					if (nn < min) {
						min = nn;
					}
					sum += nn;
					avg = sum/n;
					break;
				}
			
		}
		System.out.printf("min=%.2f%n",min);
		System.out.printf("max=%.2f%n",max);
		System.out.printf("sum=%.2f%n", sum);
		System.out.printf("avg=%.2f%n", avg);
	}
}

//		Scanner sc = new Scanner(System.in);
//		String s =sc.nextLine();
//		
//		int n = Integer.parseInt(s);
//		double num = 1;
//		double min = 1000000;
//		double max = -1000000;
//		double tot = 0;
//		double avrg =0;
//		
//
//		for (int i = 0; i < n; i++) {
//			num = Double.parseDouble(sc.nextLine());
//			
//		if (num > max) {
//				max = num;
//				
//			}
//		if (num < min) {
//				min = num;
//				
//			}
//			tot += num;
//		}
//		avrg += tot/n;
//		
//		System.out.printf("min=%.2f%n",min);
//		System.out.printf("max=%.2f%n",max);
//		System.out.printf("tot=%.2f%n",tot);
//		System.out.printf("avrg=%.2f%n",avrg);
//				
//			
//
//		}
//	}
