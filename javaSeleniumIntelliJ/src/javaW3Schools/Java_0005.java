/**
 * 
 */
package javaW3Schools;

/**
 * @author venetabaeva
 * integer
 * double
 */
public class Java_0005 {
	
	static double myDoubleNum0001  = 10.11;
	static double myDoubleNum0002 = 13.56;
	static int myInt0001 = (int)(Math.random()*101);//returns a random number between 0.0 (inclusive), and 1.0


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Math.max(myDoubleNum0001, myDoubleNum0002));//the highest value of x and y
		System.out.println(Math.min(myDoubleNum0001, myDoubleNum0002));//the lowest value of of x and y
		System.out.println(Math.sqrt(myDoubleNum0001));//the square root of x
		System.out.println(Math.abs(myDoubleNum0001));//the absolute (positive) value of x:
		System.out.println(Math.cbrt(myDoubleNum0001));//Returns the cube root of x
		System.out.println(Math.ceil(myDoubleNum0001));//Returns the value of x rounded up to its nearest integer
		System.out.println(Math.copySign(myDoubleNum0001, myDoubleNum0001));//Returns the first floating point x with the sign of the second floating point y
		System.out.println(Math.cos(myDoubleNum0001));//Returns the first floating point x with the sign of the second floating point y
		System.out.println(Math.cosh(myDoubleNum0001));//Returns the hyperbolic cosine of a double value
		System.out.println(Math.exp(myDoubleNum0001));//Returns the value of Ex
		System.out.println(Math.expm1(myDoubleNum0001));//Returns ex -1
		System.out.println(Math.floor(myDoubleNum0001));//Returns the value of x rounded down to its nearest integer
		System.out.println(Math.getExponent(myDoubleNum0001));//Returns the unbiased exponent used in x
		System.out.println(Math.hypot(myDoubleNum0001, myDoubleNum0001));//Returns sqrt(x2 +y2) without intermediate overflow or underflow
		System.out.println(Math.IEEEremainder(myDoubleNum0001, myDoubleNum0001));//Computes the remainder operation on x and y as prescribed by the IEEE 754 standard
		System.out.println(Math.log(myDoubleNum0001));
		System.out.println(Math.log10(myDoubleNum0001));
		System.out.println(Math.log1p(myDoubleNum0001));
		System.out.println(Math.max(myDoubleNum0001, myDoubleNum0001));
		System.out.println(Math.min(myDoubleNum0001, myDoubleNum0001));
		System.out.println(Math.nextAfter(myDoubleNum0001, myDoubleNum0001));//Returns the floating point number adjacent to x in the direction of y
		System.out.println(Math.nextUp(myDoubleNum0001));//Returns the floating point value adjacent to x in the direction of positive infinity
		System.out.println(Math.pow(myDoubleNum0001, myDoubleNum0001));//Returns the value of x to the power of y
		System.out.println(Math.random());//Returns a random number between 0 and 1
		System.out.println(Math.round(myDoubleNum0001));//Returns the value of x rounded to its nearest integer
		System.out.println(Math.rint(myDoubleNum0001));//Returns the double value that is closest to x and equal to a mathematical integer
		System.out.println(Math.signum(myDoubleNum0001));//Returns the sign of x
		System.out.println(Math.sin(myDoubleNum0001));//Returns the sine of x (x is in radians)
		System.out.println(Math.sinh(myDoubleNum0001));//Returns the hyperbolic sine of a double value
		System.out.println(Math.sqrt(myDoubleNum0001));//Returns the square root of x
		System.out.println(Math.tan(myDoubleNum0001));//Returns the tangent of an angle
		System.out.println(Math.tanh(myDoubleNum0001)); //Returns the hyperbolic tangent of a double value
		System.out.println(Math.toDegrees(myDoubleNum0001));//Converts an angle measured in radians to an approx. equivalent angle measured in degrees
		System.out.println(Math.toRadians(myDoubleNum0001));//Converts an angle measured in degrees to an approx. angle measured in radians
		System.out.println(Math.ulp(myDoubleNum0001));//Returns the size of the unit of least precision (ulp) of x
		System.out.println(Math.acos(myDoubleNum0001));
		System.out.println(myInt0001);
	
	}

}
