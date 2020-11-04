package javaBasicTasks;

import java.util.Scanner;

public class LoopControlBreak {
	
	static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 
		 for(int line =0;line<n;line++) {
			 for (int star =0; star<n;star++) {
				 System.out.print("*");
				 
				 if(star == line) {
					 break;
				 }
				 
			 }
			 System.out.println();
		 }
	}

}
