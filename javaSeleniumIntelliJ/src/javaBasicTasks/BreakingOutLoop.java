package javaBasicTasks;

import java.util.Scanner;

public class BreakingOutLoop {

	static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 sc = new Scanner(System.in);
		 for (int n = 0; n<=10;n++) {
			 System.out.println(n);//code before break
			 if (n==4) {
				 break;
			 }
//			 System.out.println(n);// code after break 
		 }

	}

}
