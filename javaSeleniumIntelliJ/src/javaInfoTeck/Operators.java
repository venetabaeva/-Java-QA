package javaInfoTeck;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Aritemetic Operators 
		
		System.out.println("10 + 5 = " + (10+5));
	
		System.out.println("10 - 5 = " + (10-5));
	
		System.out.println("10 * 5 = " + (10*5));
	
		System.out.println("10 / 5 = " + (10/5));

		System.out.println("10 % 5 = " + (10%5));
		
		int myInt0001 = 5;
		int myInt0002 = 10;
		int myInt0003;
		
		myInt0003 = myInt0001 + myInt0002;
		System.out.println(myInt0003);
		
		myInt0003 = myInt0001 - myInt0002;
		System.out.println(myInt0003);
		
		myInt0003 = myInt0001 * myInt0002;
		System.out.println(myInt0003);
		
		myInt0003 = myInt0001 / myInt0002;
		System.out.println(myInt0003);
		
		myInt0003 = myInt0001 % myInt0002;
		System.out.println(myInt0003);
		
		//Relational Operators
		
		System.out.println(myInt0001 > myInt0002);
		System.out.println(myInt0001 < myInt0002);
		System.out.println(myInt0001 >= myInt0002);
		System.out.println(myInt0001 <= myInt0002);
		System.out.println(myInt0001 == myInt0002);
		
		//Conditional Operators 
		
		int myInt0004 =10;
		int myInt0005 =20;
		int myInt0006 =30;
		
		if( myInt0004< myInt0005 && myInt0005 <myInt0006);
		System.out.println( "The highest value is " + myInt0006);
		if(myInt0004< myInt0005 || myInt0005 <myInt0006);
		System.out.println( "The highest value is " + myInt0006);
		
		//Unary Operators 
		System.out.println( ++ myInt0006);
		System.out.println(  myInt0006);
		System.out.println( myInt0006++);
		System.out.println(  myInt0006);
		System.out.println(  -- myInt0006);
		System.out.println(  myInt0006);
		System.out.println( myInt0006--);
		System.out.println(  myInt0006);
		
		//Bitwise Operator &,|
				int myInt0007= 25;
				// 11001
				int myInt0008 =15;
				// 01111
				int myInt0009 = myInt0007|myInt0008;
				// 11001
				// 01111
				
				// 11111
				 System.out.println(myInt0009);
	}

}
