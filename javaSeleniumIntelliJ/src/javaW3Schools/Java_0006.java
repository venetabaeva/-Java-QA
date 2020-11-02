/**
 * 
 */
package javaW3Schools;

/**
 * @author venetabaeva
 *  Integer
 *  boolean data type
 *  boolean statement
 *  switch - break statement 
 *  default statement  
 */
public class Java_0006 {

	static boolean myBoolean0001 = true;
	static boolean myBoolean0002 = false;
	
	static int myInt0001 = 20; 
	static int myInt0002 = 18;
	
	static int mytime0001 = 20;
	
	static int myInt0003 = 5;
	
	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(myBoolean0001);    
		System.out.println(myBoolean0002);   
		
		if (15 > 10) 
			{
				System.out.println("True");
			}

		if (myInt0001>myInt0002) 
			{
				System.out.println("True");
			}
		
		if (mytime0001 < 18) 
			{
				System.out.println("Good day.");
			} else {
				System.out.println("Good evening.");
			}
		
		if (mytime0001 < 10) 
			{
				System.out.println("Good morning.");
		} else if (mytime0001 < 18) {  
				System.out.println("Good day.");
		} else {
				System.out.println("Good evening.");
		}
		
		switch (myInt0003) 
			{ 
				case 1:
					System.out.println("Monday");
					break;
				case 2:
					System.out.println("Tuesday");
					break;
				case 3:
					System.out.println("Wednesday");
					break;
				case 4:
					System.out.println("Thursday");
					break;
				case 5:
					System.out.println("Friday");
					break;
				case 6:
					System.out.println("Saturday");
					break;
				case 7:
					System.out.println("Sunday");
					break;
			}
		
		switch (myInt0003) 
			{
				case 6:
					System.out.println("Saturday");
					break;
				case 7:
					System.out.println("Sunday");
					break;
				default:
					System.out.println("New week is coming!");
			}
		
		while (myInt0003 < 6) 
			{
				System.out.println(myInt0003);
				myInt0003++;
			}
		
		 do
		 	{
			 	System.out.println(myInt0003);
			 	myInt0003++;
		 	} while (myInt0003 < 6);
		 
		 for (int myInt0003 = 0; myInt0003 < 5; myInt0003++) 
		 	{
			 	System.out.println(myInt0003);
			} for (int myInt0003 = 0; myInt0003 <= 10; myInt0003 = myInt0003 + 2) {
				System.out.println(myInt0003);
			}
//NB! 
		 //Statement 1 is executed (one time) before the execution of the code block
		 //Statement 2 defines the condition for executing the code block
		 //Statement 3 is executed (every time) after the code block has been executed
		 
		 for (int myInt0003 = 0; myInt0003 < 10; myInt0003++) 
			{
			 	if (myInt0003 == 4) 
			{
			 	break; 
			}
				System.out.println(myInt0003);
			}
		 
		 for (int myInt0003 = 0; myInt0003 < 10; myInt0003++) 
		 	{
			 	if (myInt0003 == 4) 
			{
			    continue;
			}
			  System.out.println(myInt0003);
			}
		
		 while (myInt0003 < 10) 
			{
				System.out.println(myInt0003);
				myInt0003++;
				if (myInt0003 == 4) 
			{ break;}
			}
		 
		 while (myInt0003 < 10) 
			{
		
		 if (myInt0003 == 4)
			{
			 	myInt0003++;
				continue;
			}
		  		System.out.println(myInt0003);
		  		myInt0003++;
			}
	}

}
