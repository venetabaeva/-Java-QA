/**
 * 
 */
package javaW3Schools;


/**
 * @author venetabaeva
 * OOP - Object - Oriented Programming
 	* procedural programming ->  writing  methods that perform operations on data
 	* OOP -> creating objects that contain both data and methods
 */
public class Java_0009 {
	
	int myInt0001 = 10;// class attributes == variables within a class

	/**Class and Object
	 	* a class -> a template for objects;like an object constructor, or a "blueprint" for creating objects
	 	* an object -> an instance of a class;inherits  the variables and methods from the class
	 	* a static method -> can be accessed without creating an object of the class
	 	* a public method -> can only be accessed by objects
	 * @param args
	 */
	
	static void myMethod0001()
		{
			System.out.println("A Static Method will be called without created objects");
		}
	
	public void myMethod0002()
		{
			System.out.println("A Public Method will be called through created objects");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Java_0009  myObject = new Java_0009 ();
		System.out.println(myObject.myInt0001);// access attributes through Object and "."
		myObject.myInt0001 = 20;// modify attribute values 
		System.out.println(myObject.myInt0001);
		
		myMethod0001();//calls the Static Method -> The Public Method cannot be called 
		//created the object 
		myObject.myMethod0002();//called the Public Method 

	}

}
