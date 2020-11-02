/**
 * 
 */
package javaW3Schools;

/**
 * @author venetabaeva
 * abstract class
 */
abstract class Java_0014 {

	/**
	 * @param args
	 */
	public  void myMethod0001() {
		// TODO Auto-generated method stub
		System.out.println("Concrete method of parent class");
	}
	
	 public abstract void myMethod0002();

}

class Java_0015 extends Java_0014{
	public void myMethod0002() {
		 System.out.println("overriding abstract method");
	}
	public static void main(String args[]) {
		Java_0015 obj = new Java_0015();
		obj.myMethod0002();
		}
	
}
