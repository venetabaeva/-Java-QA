package javaBasicTasks;

import java.util.Scanner;

public class CompareNumbersIfs {
	
	static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		sc = new Scanner(System.in);
		 
		 String s1 = sc.nextLine();
		 String s2 = sc.nextLine();
		 String s3 = sc.nextLine();
		 String s4 = sc.nextLine();
		 String s5 = sc.nextLine();
			
			
		 double n1 = Double.parseDouble(s1);
		 double n2 = Double.parseDouble(s2);
		 double n3 = Double.parseDouble(s3);
		 double n4 = Double.parseDouble(s4);
		 double n5 = Double.parseDouble(s5);
		 
		 
		 
		 if(n1 >= n2 && n1 >= n3 && n1 >= n4 && n1 >= n5)
	        {
	            System.out.printf("%.0f",n1);
	        }
		 else if(n2 >= n1 && n2 >= n3 && n2 >= n4 && n2 >= n5) {
			 System.out.printf("%.0f",n2);
		 }
		 else if(n3 >= n1 && n3 >= n2 && n3 >= n4 && n3 >= n5){
			 System.out.printf("%.0f",n3);
		 }
		 else if(n4 >= n1 && n4 >= n2 && n4 >= n3 && n4 >= n5){
			 System.out.printf("%.0f",n4);
		 }
		 else {
			 n5 = (int)n5;
	            System.out.printf("%.0f",n5);
		 }
	}

}
