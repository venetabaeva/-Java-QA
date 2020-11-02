/**
 * 
 */
package javaW3Schools;



/**
 * @author venetabaeva
 * enum
 	*  a special "class" that represents a group of constants 
 	*  enum keyword instead of class or interface
 	*  means enumerations
 */
public class Java_0026 {
	enum myEnum0001 {
		  LOW,
		  MEDIUM,
		  HIGH
		}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		myEnum0001 myObject0001 = myEnum0001.MEDIUM; 
	    System.out.println(myObject0001);
	    
	    switch(myObject0001) {// enum switch statements to check for corresponding values
	      case LOW:
	        System.out.println("Low level");
	        break;
	      case MEDIUM:
	         System.out.println("Medium level");
	        break;
	      case HIGH:
	          System.out.println("High level");
	          break;
	          
	      }
	   
	}{
	for (myEnum0001 myObject0001 : myEnum0001.values()) {//a values() method, which returns an array of all enum constants, i.e. loop through enum constants 
		  System.out.println(myObject0001);
		}
}
}
