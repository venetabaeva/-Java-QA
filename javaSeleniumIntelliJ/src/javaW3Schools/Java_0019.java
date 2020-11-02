/**
 * 
 */
package javaW3Schools;


/**
 * @author venetabaeva
 * polymorphism
 	* many classes that are related to each other by inheritance
 */

class Java_0019 {
		  public void myMethod0001() {
		    System.out.println("1");
		  }
class Java_0020 extends Java_0019 {
		 public void myMethod0001() {
			System.out.println("2");
			  }
		}
class Java_0021 extends Java_0019 {
	 public void myMethod0001() {
		System.out.println("3");
		  }
	}

	/**
	 * @param args
	 */
class Java_0022{
	public  void main(String[] args) {
		// TODO Auto-generated method stub
		Java_0019 myObject0001 = new Java_0019();
		Java_0019 myObject0002 = new Java_0020();
		Java_0019 myObject0003 = new Java_0021();
		myObject0001.myMethod0001();
		myObject0002.myMethod0001();
		myObject0003.myMethod0001();
		
	}
}
}
	
