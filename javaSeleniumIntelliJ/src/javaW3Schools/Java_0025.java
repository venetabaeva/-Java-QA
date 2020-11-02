/**
 * 
 */
package javaW3Schools;


/**
 * @author venetabaeva
 * interface
 	* cannot be used to create objects
 	* interface methods do not have a body
 	* cannot contain a constructor.
 */
public class Java_0025 {

	/**
	 * @param args
	 */
	interface myInterface0001 {
		  public void myMethod0001(); // interface method
		}
	interface myInterface0002 {
		  public void myMethod0002(); // interface method
		}
	class Java_0026 implements myInterface0001, myInterface0002 {
		  public void myMethod0001() {
		    System.out.println("Some text..");
		  }
		  public void myMethod0002() {
		    System.out.println("Some other text...");
		  }
	}
	class Java_0027 {
		  public  void main(String[] args) {
			  Java_0026 myObj00026 = new Java_0026();
			  myObj00026.myMethod0001();
			  myObj00026.myMethod0002();
		  }
}
}

