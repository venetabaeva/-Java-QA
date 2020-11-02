/**
 * 
 */
package javaW3Schools;

import java.util.LinkedList;

/**
 * @author venetabaeva
 * LinkedList Class
 	* a collection which can contain many objects of the same type
 	* implements the List interface, i.e. has all of the same methods as the ArrayList Class
 	* built differently from ArrayList Class
 	* stores its items in "containers"
 	* use the list by looping through it instead of accessing random items
 	* frequently need to add and remove items from the beginning or middle of the list 
 */
public class Java_0030 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<String> myString0001 = new LinkedList<String>();
		 myString0001.add("a");
		 myString0001.add("b");
		 myString0001.add("c");
		 myString0001.add("d");
		    System.out.println(myString0001);

		  
		    myString0001.addFirst("First"); //adds an item to the beginning of the list
	        myString0001.addLast("Last");//adds an item to the end of the list
	        System.out.println("The new List is:" + myString0001);  // displaying the list 
	        System.out.println("The first element is: " + myString0001.removeFirst()); // removes the head 
	        System.out.println("The first element is: " + myString0001.removeLast()); //removes an item from the end of the list
	        System.out.println("The first element is: " + myString0001.getFirst()); //gets the item at the beginning of the list
	        System.out.println("The first element is: " + myString0001.getLast());// gets the item at the end of the list
	        
	}

}
