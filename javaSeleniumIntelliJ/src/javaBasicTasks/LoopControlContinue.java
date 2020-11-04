package javaBasicTasks;

import java.util.Scanner;

public class LoopControlContinue {
	
	static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 sc = new Scanner(System.in);
//		 int n = sc.nextInt();
		 
		 for(int i=1; i <10;i++) {
			 if(i % 3 == 0) {
				 continue;
			 }
			 System.out.println(i);
		
			 
	}

}
}
