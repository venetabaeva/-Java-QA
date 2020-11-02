/**
 * 
 */
package javaW3Schools;

/**
 * @author venetabaeva
 * Operators are used to perform operations on variables and values
 * Arithmetic operators 
 * Assignment operators 
 * Comparison operators 
 * Logical operators 
 * Bitwise operators 
 */
public class Java_0003 {
	
		static int myInt0001 = 2;
		static int myInt0002 = 3;
		static int myInt0003 = 2;
		static int myInt0004 = 2;
		static int myInt0005 = 2;
		static int myInt0006 = 6;
		static int myInt0007 = 1;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(myInt0001 + myInt0002);//add
		System.out.println(myInt0001 - myInt0002);//subtract
		System.out.println(myInt0001 * myInt0002);//multiply
		System.out.println(myInt0001 / myInt0002);//divide
		System.out.println(++myInt0001);//increment the value by 1
		System.out.println(--myInt0002);//decrement by 1
		
		
		System.out.println(myInt0003);
		myInt0003 += 3;// x = x + 3
		System.out.println(myInt0003);
		myInt0003 -= 3;//x = x - 3
		System.out.println(myInt0003);
		myInt0003 *= 3;//x = x * 3
		System.out.println(myInt0003);
		myInt0003 /= 3;//x = x / 3
		System.out.println(myInt0003);
		myInt0003 %= 3;//x = x % 3
		System.out.println(myInt0003);
		myInt0003 &= 3;//x = x & 3
		System.out.println(myInt0003);
		myInt0003 |= 3;//x = x | 3
		System.out.println(myInt0003);
		myInt0003 ^= 3;//x = x | 3
		System.out.println(myInt0003);
		myInt0003>>=3;//x=x>>3
		System.out.println(myInt0003);
		myInt0003<<=3;//x=x<<3
		System.out.println(myInt0003);
		
		
		System.out.println(myInt0004 == myInt0005);//Equals to
		System.out.println(myInt0004 != myInt0005);//Not - Equals to
		System.out.println(myInt0004 > myInt0005);//Greater than
		System.out.println(myInt0004 < myInt0005);//Less than
		System.out.println(myInt0004 >= myInt0005);//Greater than, or equal
		System.out.println(myInt0004 <= myInt0005);//Less than, or equal
		
	
		System.out.println(myInt0006 < 6 && myInt0007 < 6);//Returns true if both statements are true AND
		System.out.println(myInt0006 < 6 || myInt0007 < 6);//Returns true if one of the statements is true OR
		System.out.println(!(myInt0006 < 6 && myInt0007 < 6));//Reverses the result
		//logical

		System.out.println(5 & 1);//AND - Sets each bit to 1 if both bits are 1
		System.out.println(5 | 1);//OR - Sets each bit to 1 if any of the two bits is 1
		System.out.println( ~ 1);//NOT - Inverts all the bits
		System.out.println( ~ 5);//XOR - Sets each bit to 1 if only one of the two bits is 1
		System.out.println( 1<< 5);//Zero-fill left shift - Shift left by pushing zeroes in from the right and letting the leftmost bits fall off
		System.out.println( 1>> 5);//Signed right shift - Shift right by pushing copies of the leftmost bit in from the left and letting the rightmost bits fall off
		System.out.println( 1>>>5);//Zero-fill right shift - Shift right by pushing zeroes in from the left and letting the rightmost bits fall off
	}

}
