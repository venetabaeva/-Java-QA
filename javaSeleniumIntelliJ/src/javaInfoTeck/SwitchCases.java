package javaInfoTeck;

public class SwitchCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
 * Switch Case
 */
		//1
		char myChar0001 = 'x';
		
        switch (myChar0001) {
        case 'a':
        	System.out.println(myChar0001 + " is vowel");
        break;
        case 'e':
        	System.out.println(myChar0001 + " is vowel");
        break;
        case 'i':
        	System.out.println(myChar0001 + " is vowel");
        break;
        case 'o':
        	System.out.println(myChar0001 + " is vowel");
        break;
        case 'u':
        	System.out.println(myChar0001+ " is vowel");
        break;
        default:
        	System.out.println(myChar0001 + " is consonant");
   }
        //2
        char myChar0002 = 'v';
        
        switch (myChar0002) {
        case 'a' :
        	System.out.println(myChar0002 + " is a");
        break;
        
        case 'v':
        	System.out.println(myChar0002 + " is v");
        }
        
        //3
        char myChar0003 = 'v';
        
        switch (myChar0003) {
        case'b':
        	System.out.println(myChar0002 + " is b");
        break;
        default:
        	System.out.println(myChar0002 + " no match");
        break;
        }
	}

}
