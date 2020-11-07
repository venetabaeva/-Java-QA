package javaBasicTasks;

import java.util.Scanner;

public class CalculateComplexSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
 *  for a given two numbers N and x, calculates the sum S = 1 + 1!/x + 2!/x2 + … + N!/xN
 *  only one loop
 *  print the result with 5 digits after the decimal point
 */
		
		
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double x = sc.nextDouble();
		float S =0f;
		int o = 1;
		
		
		for (int i = 1; i <= n; i++)
	    {
	        for (int j = i; j >= 1; j--)
	        {
	            o *= j;
	        }
	        S += o / Math.pow(x, i);
	    }
		
//		S =  1 + 1!/x + 2!/x2 + … + N!/xN
		
		System.out.println(S);
		
		
	}

}
