/**
 * 
 */
package javaW3Schools;



/**
 * @author venetabaeva
 * Thread
 	* possible to extend from another class
 	* no way to know in which order the code will run
 */
public class Java_0033 implements Runnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java_0033 myObj0001 = new Java_0033();
	    Thread myThread0001 = new Thread(myObj0001);
	    myThread0001.start();
	    System.out.println("This code is outside of the thread");
	  }
	  public void run() {
	    System.out.println("This code is running in a thread");
	  }
	}
