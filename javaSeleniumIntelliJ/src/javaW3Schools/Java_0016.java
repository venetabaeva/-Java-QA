/**
 * 
 */
package javaW3Schools;



/**
 * @author venetabaeva
 * encapsulation
 */



public class Java_0016 {
	private String myString;
	
	public String getmyString()//•	the get method returns the value of the variable 
	{
		return myString;
	}
	public  void setmyString(String newmyString)//the set method takes a parameter  and assigns it to the name variable
	{
		this.myString = newmyString;//this keyword is used to refer to the current object	
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Java_0016 myObject = new Java_0016 ();
		myObject.setmyString("Veneta");
		System.out.println(myObject.getmyString());
	}

}
