/**
 * 
 */
package javaW3Schools;
import java.util.Scanner;  
/**
 * @author venetabaeva
 * Scanner Class
 	*  used to get user's input
 */
class Java_0027 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj001 = new Scanner(System.in);  // creates a Scanner object
	    System.out.println("Enter username");

	    String userName = myObj001.nextLine();  // reads user input
	    System.out.println("Username is: " + userName);  // outputs user's input
	 
	    boolean value = myObj001.nextBoolean();// reads a boolean value from the user
	    System.out.println(value);
	  
	    while (myObj001.hasNext())//finds the next Byte token and print it
	        // loop for the whole myObj001
	    {
	    	if(myObj001.hasNextByte()) //reads a byte value from the user
	    		//if the next is byte with radix 7, print found and the byte
	    	{ 
	    		System.out.println(myObj001.nextByte(7));
	    	}
	    		System.out.println(myObj001.next());//if a Byte is not found, print "Not Found" and the token
	    }
	    myObj001.close();//close the Object 
	
	//find the next double token and print it
    //loop for the whole scanner
		while (myObj001.hasNext()) 
		{
    		// if the next is a double, print found and the double
    		if (myObj001.hasNextDouble()) 
    		{
    			System.out.println("Found :" + myObj001.nextDouble());//Reads a double value from the user
    		}

    			// if a double is not found, print "Not Found" and the token
    			System.out.println("Not Found :" + myObj001.next());
		}	
		myObj001.close();
		
		//find the next float token and print it
	    // loop for the whole scanner
	    while (myObj001.hasNext()) 
	    {
	    	myObj001.next();
	     
	    	// if the next is a float, print found and the float
	    	if (myObj001.hasNextFloat()) //Reads a float value from the user
	    	{
	    		System.out.println("Found :" + myObj001.nextFloat());
	    	}
	    }
	    myObj001.close();
	    
	     // find the next int token and print it
	    // loop for the whole scanner
	    while (myObj001.hasNext()) 
	    {

	    	// if the next is a int, print found and the int
	    	if (myObj001.hasNextInt()) 
	    	{
	    		System.out.println("Found :" + myObj001.nextInt());//reads a int value from the user
	    	}
	    		// if no int is found, print "Not Found:" and the token
	    		System.out.println("Not Found :" + myObj001.next());
	    }
	    myObj001.close();
	    
	    // print the next line
	    System.out.println("" + myObj001.nextLine());//reads a String value from the user

	    // print the next line again
	    System.out.println("" + myObj001.nextLine());

	    // close the scanner
	    myObj001.close();
	    
	    // get next long value 
	    long value0001 = myObj001.nextLong();//Reads a long value from the user

	    // check the value  
	    System.out.println("Long value is: " + value0001);
	 

	    // string input
	    String myString0001 = myObj001.nextLine();

	    // Numerical input
	    int myInt0001 = myObj001.nextInt();
	    double myDouble0001 = myObj001.nextDouble();
	    // Output input by user
	    System.out.println("Name: " + myString0001);
	    System.out.println("Age: " + myInt0001);
	    System.out.println("Salary: " + myDouble0001);
	    
	    //If one enters wrong input, i.e. text in a numerical input, one will get an exception/ error message
	 }

}

