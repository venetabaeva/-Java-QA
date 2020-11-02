/**
 * 
 */
package javaW3Schools;



/**
 * @author venetabaeva
 * Thread
 	* when a class extends the Thread Class, one cannot extend any other class
 	* no way to know in which order the code will run
 */
public class Java_0032 extends Thread {
	public static int amount = 0;
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Java_0032 myThread0001 = new  Java_0032();
	    ((Thread) myThread0001).start();
	    System.out.println("This code is outside of the thread");
	    
	    //code example where the value of the variable amount is unpredictable and o way to know in which order the code will run
	    myThread0001.start();
	    System.out.println(amount);
	    amount++;
	    System.out.println(amount);
	    
	    //
	    while(myThread0001.isAlive()) {//after myThread0001.start();avoids concurrency problems
		    System.out.println("Waiting...");
	     }
	
	    System.out.println("Main: " + amount); // updates amount and print its value
	    amount++;
	    System.out.println("Main: " + amount);
	}
	    public void run() {
	    System.out.println("This code is running in a thread");
	    
	    amount++;
	 
	  }
	
}

