package javaTelerick;

import java.util.Scanner;

/*
 * Input: reads from the console a positive integer N
 * Output:prints all the numbers from 1 to N 
 * IF not divisible by 3 or 7, on a single line, separated by a space
 */

public class NotDivisableNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		  Scanner sc = new Scanner(System.in);
		  int N = Integer.parseInt(sc.nextLine());
		  
		  for (int i = 1;i <= N; i++) {
			  if(i%3 !=0 && i%7!=0) {
				  System.out.printf(" %d ",i);
			  }
		  
	}

	}

}
