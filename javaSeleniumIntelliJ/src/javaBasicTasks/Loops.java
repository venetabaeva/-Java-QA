package javaBasicTasks;

import java.util.Scanner;

public class Loops {
	static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 sc = new Scanner(System.in);
		 
		 int n = sc.nextInt();
		 int sum = 0;
		 
		 while (n>0) {
			 sum+=n;
			 n = sc.nextInt(); 
		 }
		 
		 System.out.println(sum);
		 System.out.println("End");
		
	}

}
