package javaBasicTasks;

import java.util.Scanner;

public class Compare {
	
	
	static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 sc = new Scanner(System.in);
		 
		 String s1 = sc.nextLine();
		 String s2 = sc.nextLine();
		 String s3 = sc.nextLine();
			
		 double n1 = Double.parseDouble(s1);
		 double n2 = Double.parseDouble(s2);
		 double n3 = Double.parseDouble(s3);
		 
		 if(n1 >= n2 && n1 >= n3 )
	        {
			 
	            System.out.printf("%.0f",n1);
	        }
	        else if(n2 >= n1 && n2>=n3 )
	        {
	        
	        	System.out.printf("%.0f",n2);
	        }
	        else
	        {
	        	n3 = (int)n3;
	            System.out.printf("%.0f",n3);
	            
	        }
	}

}
