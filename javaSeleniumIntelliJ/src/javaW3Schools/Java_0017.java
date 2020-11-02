/**
 * 
 */
package javaW3Schools;



/**
 * @author venetabaeva
 * inherit  -> use extend keyword 
 * stop inheritance -> use final keyword 
 */
class Java_0017 { //use final here
		protected String myString0001 = "Ford"; //attribute       
		public void myMethod0001() {             //method      
		    System.out.println("Wow!");
	  }    
}
	/**
	 * @param args
	 */
class Java_0018 extends Java_0017 {
		 private String myString0002 = "Focus";    // attribute
		 public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			 Java_0018 myString = new Java_0018();		
			 
			 System.out.println(myString.myString0001 + " " + myString.myString0002);
	}
	}

