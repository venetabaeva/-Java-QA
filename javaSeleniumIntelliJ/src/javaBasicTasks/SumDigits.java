package javaBasicTasks;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*
		 * reads a four-digit number  
		 * displays the sum of its digits
		 */
		Scanner sc = new Scanner(System.in);
        int d =  Integer.parseInt(sc.nextLine());
        int sum = 0;
        while(d!=0){
            sum = sum +d % 10;
            d = d/10;
        }
        System.out.print(sum);
        Thread.sleep(5000);
		sc.close();
		
	}

}
