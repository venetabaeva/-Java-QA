/**
 * 
 */
package javaW3Schools;

/**
 * @author venetabaeva
 *
 */
// start code from Java_0012
public abstract class Java_0012{//abstract parent class
	public String myString0001 = "Veneta";
	public int myInt0001 = 31;
	public abstract void myMethod0001(); // abstract method
}

class Java_0013 extends Java_0012{
	public String myString0002 = "Cognitive Scientist";
	public void myMethod0001(){
			System.out.println("Working as: ");
}
// end code from Java_0012
	 
	 
	 public static void main(String args[]){
		 Java_0013 myObj = new Java_0013();
			
			System.out.println(myObj.myString0001);
		    System.out.println( myObj.myInt0001);
		    System.out.println(myObj.myString0002);
		    myObj.myMethod0001(); // call abstract method
}

 }
 
