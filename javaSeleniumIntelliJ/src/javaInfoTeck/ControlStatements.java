package javaInfoTeck;

public class ControlStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
 * Control Statements
 */
		//1
		int myInt0001 = 100;
		int myInt0002 = 50;
		
		if	(myInt0001>myInt0002){
		System.out.println("Score: High");
		}
		
		//2
		int myInt0003 = 82;
		if (myInt0003>70) {
			System.out.println("True");
		}
		
		
		//3
		int myInt0004 = 100;
		int myInt0005 = 150;
		if (myInt0004 > myInt0005) {
			System.out.println("Score: High");
		}
		else {
			System.out.println("Score: Low");
		}
		
		//4
		int myInt0006 = 62;
		if (myInt0006>70) {
			System.out.println("Score: High");
		}
		else {
			System.out.println("Score: Low");
		}
		
		//5
		int myInt0007 = 1000;
		int myInt0008 = 150;
		int myInt0009 = 200;
		
		if (myInt0007>myInt0008) {
			if(myInt0007>myInt0009){
				
			}
			System.out.println(myInt0007 + " is highest");
		}
		else {
			if (myInt0008>myInt0009) {
				System.out.println("myInt0008 is high");
			}
			else {
				System.out.println("myInt0009 is high");
			}
			
		//6	
		int myInt0010 = 76;
		char myChar0001;
		
		if (myInt0010 >=90) {
			myChar0001 = 'A';
		}
		else if(myInt0010 >=80) {
			myChar0001 = 'B';
		}
		else if (myInt0010 >=70){
			myChar0001 = 'C';
		}
		else if(myInt0010 >=60){
			myChar0001 = 'D';
		}
		else {
			myChar0001 = 'F';
		}
		System.out.println("Score = " + myChar0001 );
		}
	}

}
