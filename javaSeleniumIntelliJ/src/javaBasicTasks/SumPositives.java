package javaBasicTasks;

import java.util.Scanner;

public class SumPositives {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * reads a positive integer (n)
		 * print the sum of all integers from 1 to n
		 */
		
		 Scanner sc = new Scanner(System.in);
	        int s1 = Integer.parseInt(sc.nextLine());
	        double min =1.0;
	        double div =2.0;
	        int r = (int) (s1*(s1+min)/div);
	        System.out.print(r);
	        
	        Thread.sleep(5000);
			sc.close();
	}

}
