package javaBasicTasks;

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * deposit a sum into your bank account for 3 years
		 * an interest of 5% per year
		 * calculate the amount in your deposit for each year
		 */
		Scanner sc = new Scanner(System.in);
        int i1 = Integer.parseInt(sc.nextLine());
        double i = 5.0/100.0;
        float r1 = (float) (i*i1+i1);
        float r2 = (float) (i*r1+r1);
        float r3 = (float) (i*r2+r2);
        
        System.out.printf("%.2f%n%.2f%n%.2f",r1,r2,r3);
    
		sc.close();
		
	}

}
