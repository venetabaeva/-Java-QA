/**
 * 
 */
package javaW3Schools;

import java.util.Scanner;

/**
 * @author venetabaeva
 *
 */
public class Java_0036 {
	
	static int x = 5;
	static int y = 6;
	static int sum = x + y;
	


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum); // prints the sum of x + y
		
		int x, y, sum;
	    Scanner myObj = new Scanner(System.in); // creates a Scanner object
	    System.out.println("Type a number:");
	    x = myObj.nextInt(); // reads user input

	    System.out.println("Type another number:");
	    y = myObj.nextInt(); // reads user input

	    sum = x + y;  // calculates the sum of x + y
	    System.out.println("Sum is: " + sum); // prints the sum
	}

}
