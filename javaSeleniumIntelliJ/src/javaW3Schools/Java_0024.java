/**
 * 
 */
package javaW3Schools;



/**
 * @author venetabaeva
 * abstract -> a non - access modifier
 */
public class Java_0024 {

	abstract class Java_0025{
		  public abstract void animalSound();
		  public void sleep() {
		    System.out.println("Zzz");
		  }
		  class Java_0026 extends Java_0025 {
			    public void animalSound() {
			      System.out.println("wee wee");
			    }
			  }
	/**
	 * @param args
	 */
		  class Java_0027 {	  
	public  void main(String[] args) {
		// TODO Auto-generated method stub
		Java_0026 myObj0026 = new Java_0026(); 
		myObj0026.animalSound();
		myObj0026.sleep();
	}
	}

}
}