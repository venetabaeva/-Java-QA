/**
 * 
 */
package javaW3Schools;

/**
 * @author venetabaeva
 * array and statements 
 * 
 */
public class Java_0007 {
	

	static String[] myString0001 = {"Neuron","is","a","cell","."};
	static int [] myInt0001= {10,20,30,40,50};
	static char[] myChar0001 = {'n','e','u','r','o','n'};	
	
	static int [] [] myInt0002 = {{1,2,3,4},{5,6,7,8,9}};
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(myString0001.length);
		
		//access an array through index
	
		System.out.println(myString0001[0]);
		System.out.println(myInt0001[0]);
		System.out.println(myChar0001[0]);
		
		//change the value of element referring  to an index number
		
		myString0001 [0] = "Nothing";
		System.out.println(myString0001[0]);
		
		for (int myInt0001 = 0; myInt0001 < myString0001.length;myInt0001++)
			{
				System.out.println(myString0001[myInt0001]);
			}
		
		for (String myString0002 : myString0001 )
			{
				System.out.println(myString0002);
			}
		
		int myInt0003 = myInt0002[1][2];
		System.out.println(myInt0003);
		
	}
}
