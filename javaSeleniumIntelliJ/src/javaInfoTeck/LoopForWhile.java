package javaInfoTeck;

public class LoopForWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
 * For Loop 
 * While Loop
 */ 

		//For 
		for (int myInt0001 = 1; myInt0001 <= 10; myInt0001++)
	       {       
	               System.out.println(myInt0001);
	       }

 
		//While
		int myInt0002 = 1; 
			while(myInt0002 <= 10) {
				System.out.println(myInt0002);
				System.out.println(" ");
			myInt0002++; 
			}

		//While
		int myInt0003 = 1, myInt0004 = 3;
			while(myInt0004 < 20)
			{
				System.out.println(myInt0004 + " ");
				myInt0003++;
				myInt0004 = myInt0003*3;
			}
			
		//DoWhile
		int myInt0005 = 1; 
		do {
			System.out.println(myInt0005);
			myInt0005++;
			}
				while (myInt0005<=10);
		
		
			}
		
	}
	   
