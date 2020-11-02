/**
 * 
 */
package javaW3Schools;

/**
 * @author venetabaeva
 * method and statements
 */
public class Java_0008 {
	
	static void myMethod0001(String myName,int myAge) // myName -> a parameter -> passed to the method, is an argument
    {
		System.out.println(myName + " is " + myAge);
    }
	
	static int myMethod0002(int myInt)
	{
		return 5 + myInt;
	}	

	static void myMethod0003(int myAge) 
	{
		if (myAge < 31)
			{
				System.out.println("False");	
			}else {
				System.out.println("True");
			}
	}
	
	static int myIntMethod0004(int myNum, int myNum0001)
	{
		return myNum + myNum0001;
	}
	
	static double myDoubleMethod0005(double myNum,double myNum0001) 
	{
		return myNum + myNum0001;
	}
	
	
	/**
	 * @param args
	 * static -> the method belongs to the Java_0008 class and not an object of the Java_0008 class
	 * void ->  the method does not have a return value
	 * a variable -> only accessible - scope inside the region this is created 
	 * a variable -> accessible anywhere in the method, if declared inside a method  
	 * a variable  declared inside block of code is only accessible by the code between the curly braces following the line in which the variable was declared

	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myMethod0001("Veneta Baeva",31);// arguments of the parameter myName and myAge

		System.out.println(myMethod0002(3));
		
		myMethod0003(31);
		
		int resultInt = myIntMethod0004(8,5);
		System.out.println(resultInt);
		double resultDouble = myDoubleMethod0005(4.3,6.26);
		System.out.println(resultDouble);
			
	}	

}
