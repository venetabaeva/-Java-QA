/**
 * 
 */
package javaW3Schools;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.io.File;

/**
 * @author venetabaeva
 * Lambda expression
 	* passed as parameter to a function
 	* a short block of code which takes in parameters and returns a value
 	* similar to method, but they do not need a name, i.e. can be implemented right in the body of a method
 	* can be stored in variables of type interface which has only one method
 		* should have the same number of parameters and the same return type as that one method (java.util package, Consumer Interface)
 */
public class Java_0034 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> myNumbers0001 = new ArrayList<Integer>();
		myNumbers0001.add(5);
		myNumbers0001.add(9);
		myNumbers0001.add(8);
		myNumbers0001.add(1);
		myNumbers0001.forEach( (n) -> { System.out.println(n); } );

	    Consumer<Integer> myMethod0001 = (n) -> { System.out.println(n); };
	    myNumbers0001.forEach( myMethod0001 );


		}
}
