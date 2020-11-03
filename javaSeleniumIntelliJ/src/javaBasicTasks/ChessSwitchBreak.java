package javaBasicTasks;

import java.util.Scanner;

public class Test {
	static Scanner sc;
	static String input;

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		
		    
			sc = new Scanner(System.in);
		    String l = sc.nextLine();
		    int r = Integer.parseInt(sc.nextLine());
		  
		    
//		    boolean isOdd = (r %1 ==0);
//		    boolean isEven = (r %2 == 0);
		 
		    		    

		    if (l == "a" || l == "c" ||l == "e" || l == "g" ){
		    	
				if (r == 1 || r == 3 || r == 5 || r == 7) {
					System.out.println("black"); }
				else {
					System.out.println("white");
				}
			}
		    else {
		    	 if (l == "b" || l == "d" ||l == "f" || l == "h" ) {
					System.out.println("white");}
		    	else {
					System.out.println("black");
		    }


		    	
		    	
		}

	}

}

