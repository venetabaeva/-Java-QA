package javaBasicTasks;
import java.util.Scanner;

public class IfElse {
	
	/*
	 * 2 HY = 10 DY
	 * Next 2 HY = 4DY
	 * convert human years (HY) to dog years (DY)
	 */
	
	static Scanner sc;
	static String input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		    sc = new Scanner(System.in);
		     
		    input = sc.nextLine();
		    int humanYears = Integer.parseInt(input);
		    int dogYears = 0;

		    if(humanYears<=2){
		        dogYears = humanYears*10;
		    }else{
		        dogYears = 20 + (humanYears - 2)*4;
		    }
		    System.out.print(dogYears);



	}

}
