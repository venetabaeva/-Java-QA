package javaTelerick;

import java.util.Scanner;

/*
Input: 
1 hour of free calls  and 20 text messages for 12.00 levas. 
Each additional minute costs 0.10 levas and each additional message costs 0.06 levas
any additional minutes/text messages are subject to 20% sales tax
On the first line, you will receive the total amount of text messages.
On the second line, you will receive the total amount of minutes.
Output:
1st line - number of additional messages and additional amount paid
2nd line - number of additional minutes and additional amount paid
3rd line - amount paid in taxes
4th line - total bill


*/

public class CalculateChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		 
		 int messages = Integer.parseInt(sc.nextLine());
		 int min = Integer.parseInt(sc.nextLine());
		 
		 
		 double messagesAdditionalCost = 0.06;
		 double minuAdditionalCost = 0.10;
		 double tax = 0.2;
		 double abonament = 12.00;
		 int additionalMessages = 0;
		 int additionalMin = 0;
		 double messageAdditionalToPay = 0.00;
		 double minAdditionalToPay = 0.00;
		 double taxAdditionalToPay = 0.00;
		 double abonamentAndTotalToPay = 0.00;
		
		 
		 
		 
		 if (messages <= 20 && min <= 60 ) {
			 
			 abonamentAndTotalToPay = abonament;
			 
			 System.out.printf(  " %d additional messages for %.2f levas %n", additionalMessages,messageAdditionalToPay);
			 System.out.printf(   " %d additional minutes for %.2f levas %n",additionalMin,minAdditionalToPay);
			 System.out.printf(  " %.2f additional taxes %n",taxAdditionalToPay);
			 System.out.printf(  " %.2f  total bill %n",abonamentAndTotalToPay);

		 }
		 
		 if (messages > 20 && min > 60 ) {
			 
			 additionalMessages = messages - 20;
			 additionalMin = min - 60;
			 messageAdditionalToPay = additionalMessages*messagesAdditionalCost;
			 minAdditionalToPay = additionalMin*minuAdditionalCost;
			 taxAdditionalToPay = tax*(messageAdditionalToPay+minAdditionalToPay);
			 abonamentAndTotalToPay = abonament + messageAdditionalToPay+ minAdditionalToPay+taxAdditionalToPay;
			 
			

			 System.out.printf(  " %d additional messages for %.2f levas %n", additionalMessages,messageAdditionalToPay);
			 System.out.printf(   " %d additional minutes for %.2f levas %n",additionalMin,minAdditionalToPay);
			 System.out.printf(  " %.2f additional taxes %n",taxAdditionalToPay);
			 System.out.printf(  " %.2f  total bill %n",abonamentAndTotalToPay);

		 }

	}

}
