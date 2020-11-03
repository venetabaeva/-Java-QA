package javaBasicTasks;

import java.util.Scanner;

public class SwitchIntegerToString {
	static Scanner sc;

	public static void main(String[] arg) {
		// TODO Auto-generated method stub
	
	    	
	   
	    int r = 0;
	    sc = new Scanner(System.in);
		

		try {

		   r = sc.nextInt();
		 
			   switch (r){
			   case 0:
	 				System.out.println("zero");
	 			break;
	 			case 1:
	 				System.out.println("one");
	 			break;
	 			case 2:
	 				System.out.println("two");
	 			break;
	 			case 3:
	 				System.out.println("three");
	 			break;
	 			case 4 :
	 				System.out.println("four");
	 			break;
	 			case 5:
	 				System.out.println("five");
	 			break;
	 			case 6:
	 				System.out.println("six");
	 			break;
	 			case 7:
	 				System.out.println("seven");
	 			break;
	 			case 8:
	 				System.out.println("eight");
	 			break;
	 			case 9:
	 				System.out.println("nine");
	 			break;
	 				
	 			default:
	 				System.out.println("not a digit"); 
	        	 }
		   
		 } catch (Exception e) {
			System.out.println("not a digit");
		 }

		sc.close();
	   }
	  
} 
  
