/**
 * 
 */
package javaW3Schools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author venetabaeva
 * ArrayList Class
 	* a resizable array
 	* elements can be added and removed from an ArrayList in comparison with just Array
 	* has a regular array inside it
 	* an element is added, it is placed into the array
 	* larger array is created to replace the old one and the old one is removed, if an element must be added
 	* Arrays store items as an ordered collection and to access them use an index number (int type)
 */

public class Java_0029 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myString0001 = new ArrayList<String>(); // creates an ArrayList object

		myString0001.add("a");// adds elements to the ArrayList
		myString0001.add("b");
		myString0001.add("c");
		myString0001.add("d");
	    System.out.println(myString0001);
	    
	    myString0001.get(0);//accesses an element in the ArrayList
	    myString0001.set(0, "A");//modifies an element
	    myString0001.remove(0);//removes an element
	    myString0001.clear();//removes all the elements in the ArrayList
	    myString0001.size();//finds out how many elements an ArrayList have
	    
	    for (int myInt0001 = 0; myInt0001 < myString0001.size(); myInt0001++) {//loops through the elements of an ArrayList with a for loop
	    	System.out.println(myString0001.get(myInt0001));
	    }
	    
	    for (String myInt0001 : myString0001) {// loop through an ArrayList with the for-each loop
	        System.out.println(myInt0001);
	      }
	    
	    Collections.sort(myString0001);  // Sort cars
	    for (String myInt0001 : myString0001) {
	      System.out.println(myInt0001);
	    }
/**
* 
* @author venetabaeva
* HashMap
	* stores items in "key/value" pairs
	* accesses the stored items by an index of another type
	* one object is used as a key (index) to another object (value)
		* can store different types
	* 
*/
	    HashMap<String, String> myString0002 = new HashMap<String, String>();
	    // adding keys and values 
	    myString0002.put("A", "a");
	    myString0002.put("B", "b");
	    myString0002.put("C", "c");
	    myString0002.put("D", "d");
	    System.out.println(myString0002);
	    
	    myString0002.get("B"); // accesses a value in the HashMap
	    myString0002.remove("B"); //removes an item
	    myString0002.clear(); //removes all items
	    myString0002.size(); //finds out how many items there are
	   
	    
	    for (String myString0003 : myString0002.keySet()) {// print keys
	      System.out.println(myString0003);
	    }
	   
	    for (String myString0003 : myString0002.values()) { // print values
	      System.out.println(myString0003);
	    }
	   
	    for (String myString0003 : myString0002.keySet()) { // print keys and values
	      System.out.println("key: " + myString0003 + " value: " + myString0002.get(myString0003));

	    }

	    HashMap<String, Integer> myStringInt0001 = new HashMap<String, Integer>();
	    // adding keys and values 
	    myStringInt0001.put("a", 32);
	    myStringInt0001.put("b", 30);
	    myStringInt0001.put("c", 33);
	    
	    for (String myString0004 : myStringInt0001.keySet()) {
		      System.out.println("key: " + myString0004 + " value: " + myStringInt0001.get(myString0004));
		    }
	    
	    HashSet<String> myString0005 = new HashSet<String>();//a HashSet object called stores strings
	    
	    myString0005.add("a");
	    myString0005.add("b");
	    myString0005.add("c");
	    myString0005.add("d");
	    myString0005.add("e");
	    System.out.println(myString0005);
	    

	    myString0005.contains("Mazda");////checks whether an item exists in a HashSet
	    myString0005.remove("Volvo"); //removes an item, use the remove() method
	    myString0005.clear();//removes all items
	    myString0005.size();//finds out how many items there are
	    
	    for (String myString0006 : myString0005) {//loops through the items of an HashSet 
	    	  System.out.println(myString0006);
	    	}
	    
	    ArrayList<String> myString0007 = new ArrayList<String>();// makes a collection
	    myString0007.add("a");
	    myString0007.add("b");
	    myString0007.add("c");
	    myString0007.add("d");
	    
	    Iterator<String> myIter0007 = myString0007.iterator();//gets the iterator which is an object that can be used to loop through collections
	    System.out.println(myIter0007.next()); //prints the first item
	    while(myIter0007.hasNext()) {////loops through a collection
	    	  System.out.println(myIter0007.next());
	    	}
	    
	    ArrayList<Integer> myInt0002 = new ArrayList<Integer>();
	    myInt0002.add(12);
	    myInt0002.add(8);
	    myInt0002.add(2);
	    myInt0002.add(23);
	    Iterator<Integer> myIter0002 = myInt0002.iterator();
	    while(myIter0002.hasNext()) {
	      Integer myInt0003 = myIter0002.next();
	      if(myInt0003 < 10) {
	    	  myIter0002.remove();//changes the collections that Iterator loops through
	      }
	    }
	    System.out.println(myInt0002);
	    
	    
 /** Wrapper Classes 
 * use primitive data types as objects
 *  when working with Collection objects, such as ArrayList where primitive types cannot be used (only Objects are used)
*/
	    ArrayList<Integer> myNumb0001 = new ArrayList<Integer>();
	    	//creates a wrapper object => now working with objects
	    Integer myInt0005 = 500;
	    Double myDouble0005 = 5.99;
	    Character myChar0005 = 'A';
	    System.out.println(myInt0005);			
	    System.out.println(myDouble0005);
	    System.out.println(myChar0005);
	    
	    System.out.println(myInt0005.intValue());//uses  method to get information about the specific object
	    System.out.println(myDouble0005.doubleValue());
	    System.out.println(myChar0005.charValue());
	    
	    String myString0006 = myInt0005.toString();//converts wrapper objects to strings
    	System.out.println(myString0006.length());
    	
    	try {//defines a block of code to be tested for errors while it is being executed
  		  //  block of code to try
  		}
  		catch(Exception e) {// defines a block of code to be executed,if an error occurs in the try block
  		  //  block of code to handle errors
  		}
    	
    	try {
  	      int[] myNumb0002 = {1, 2, 3};
  	      System.out.println(myNumb0002[10]);
  	    } catch (Exception e) {
  	      System.out.println("Something went wrong.");
  	    } finally { // executes code, after try...catch, regardless of the result
  	    	System.out.println("The 'try catch' is finished.");
  	    }
    	
    	if (myInt0005 < 18) 
    	{
          throw new ArithmeticException("Access denied!");//creates a custom error and used together with an exception type
    	} else {
            System.out.println("Access granted!");
          }
        }

	}

