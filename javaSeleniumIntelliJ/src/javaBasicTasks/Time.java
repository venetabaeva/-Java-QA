package javaBasicTasks;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*
		 * reads days, hours, minutes and seconds from the standard input
		 * Display the total amount of seconds
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
        int d =  Integer.parseInt(sc.nextLine());
        int h =  Integer.parseInt(sc.nextLine());
        int m =  Integer.parseInt(sc.nextLine());
        int s =  Integer.parseInt(sc.nextLine());

        long r = (d*24*60*60)+(h*60*60)+( m*60)+(s);
        System.out.print(r);
        Thread.sleep(5000);
		sc.close();
		
		
	
		
		
	}

}
