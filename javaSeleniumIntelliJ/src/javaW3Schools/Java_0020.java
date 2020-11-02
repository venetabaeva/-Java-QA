/**
 * 
 */
package javaW3Schools;



/**
 * @author venetabaeva
 * nest class
 	* a class within class 
 */
class OuterClass {
	  int x = 10;

	  class InnerClass {//can be protected adding private 
	    int y = 5;
	    public int myInnerMethod() { // added -> accesses the OuterClass
		      return x;
		    }
	  }
	}

public class Java_0020 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass myObject0001 = new OuterClass();
	    OuterClass.InnerClass myObject0002 = myObject0001.new InnerClass();
	    System.out.println(myObject0002.y + myObject0001.x);

	}

}



