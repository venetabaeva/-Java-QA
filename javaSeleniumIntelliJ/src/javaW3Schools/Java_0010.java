/**
 * 
 */
package javaW3Schools;



/**
 * @author venetabaeva
 * constructor = special method 
 	* to initialize objects
 	* called when an object of a class is created
 	* used to set initial values for object attributes  	
 */
public class Java_0010 {
	
	int myInt;//create a class attribute
	String myString;

	/**
	 * @param args
	 */
	public Java_0010(int myInt0001, String myString0001)//create a class constructor with name  matching the class name and no return type like void
	{
		myInt= 10; // initial value set for the class attribute myIntnum
		myString = myString0001;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Java_0010 myObject = new Java_0010(5,"Something");//create an object of class Java_0010 that will call the constructor 
		System.out.println(myObject.myInt + myObject.myString);	
	}

}
