package javaBasicTasks;

import java.util.Scanner;

public class LeastAmount {
	
	static Scanner sc;

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
/*
 *   bill plan includes 1 hour of free calls and 20 text messages for 12.00 levas
 *   Each additional minute costs 0.10 levas and each additional message costs 0.06 levas
 *   any additional minutes/text messages are subject to 20% sales tax
 *    calculates the additional charge for text, the additional charge for minutes, and the sales tax charge for both
 */
		
		 sc = new Scanner(System.in);
		 int messages = Integer.parseInt(sc.nextLine());
		 int min = Integer.parseInt(sc.nextLine());
		
		 int extraMessages = 0;
		 if (messages>20) {
			  extraMessages = messages - 20;
			  System.out.println(extraMessages +" additional messages for 0.66 levas");
		 }
		 int extraMin = 0;
		 if (min>20) { 
			  extraMin = min - 60;
			  System.out.println(extraMin +" additional minutes for 5.50 levas");
		 }
	      
		 double extraMessagesPrice = extraMessages * 0.06;
		 double extraMinPrice = extraMin *0.10;
		 
		 double tax = (extraMessagesPrice + extraMinPrice  )*0.2;
		 tax = Math.round(tax*100)/100.0d;
		 System.out.println(tax+" additional taxes");
		 double total = 12 + extraMessagesPrice + extraMinPrice + tax; 
		 System.out.println(total +" total bill");
	}

}
