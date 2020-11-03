package javaBasicTasks;

import java.util.Scanner;

public class AssignNumberToWord {
	static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  
		    sc = new Scanner(System.in);
		    int r = sc.nextInt();
		    
		    String[] zodiacs =  {"Rat","Monkey", "Rooster", "Dog", "Pig", "Ox", "Tiger",
					"Hare","Dragon", "Snake", "Horse", "Sheep"};
		    
		    switch (r){
			   case 2008:
	 				System.out.println("Rat");
	 			break;
	 			case 2004:
	 				System.out.println("Monkey");
	 			break;
	 			case 2005:
	 				System.out.println("Rooster");
	 			break;
	 			case 2006:
	 				System.out.println("Dog");
	 			break;
	 			case 2007 :
	 				System.out.println("Pig");
	 			break;
	 			case 2009:
	 				System.out.println("Ox");
	 			break;
	 			case 2010:
	 				System.out.println("Tiger");
	 			break;
	 			case 2011:
	 				System.out.println("Hare");
	 			break;
	 			case 2000:
	 				System.out.println("Dragon");
	 			break;
	 			case 2001:
	 				System.out.println("Snake");
	 			break;
	 			case 2002:
	 				System.out.println("Horse");
	 			break;
	 			case 2003:
	 				System.out.println("Sheep");
	 			break;
	 				
	 			default:
	 				 System.out.println(zodiacs[r % 12]);
	        	 }
		   

		 				
		        	 }		   
	


		   }
		  
	
	  
