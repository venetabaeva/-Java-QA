package javaBasicTasks;

import java.util.Scanner;

public class Do {
	static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 sc = new Scanner(System.in);
		 
		
		 int sum = 0;
		 int n = 0;
		 
		 do {
			 n = sc.nextInt();
			 sum+=n;
		 } while (n>0);
		 System.out.println(sum);
		 System.out.println("End");
	}

}
