package javaBasicTasks;

import java.util.Scanner;

public class SummaryQA {

	public static void main(String[] args) {
		
//Methods
		//main - name
		//static the method belongs to the SummaryQA class and not an object of the SummaryQA class. 
		//void means that this method does not have a return value
		
		//Call a method 
			//public class MyClass {static void myMethod() {System.out.println("I just got executed!");}public static void main(String[] args) {myMethod();}}
		// TODO Auto-generated method stub
//Method Parameters
//		public class MyClass {
//			  static void myMethod(String fname, int age) {
//			    System.out.println(fname + " is " + age);
//			  }
//
//			  public static void main(String[] args) {
//			    myMethod("Liam", 5);
//			    myMethod("Jenny", 8);
//			    myMethod("Anja", 31);
//			  }
//			}
		//If-Else 
//		public class MyClass {
//
//			  // Create a checkAge() method with an integer variable called age
//			  static void checkAge(int age) {
//
//			    // If age is less than 18, print "access denied"
//			    if (age < 18) {
//			      System.out.println("Access denied - You are not old enough!");
//
//			    // If age is greater than, or equal to, 18, print "access granted"
//			    } else {
//			      System.out.println("Access granted - You are old enough!");
//			    }
//
//			  }
//
//			  public static void main(String[] args) {
//			    checkAge(20); // Call the checkAge method and pass along an age of 20
//			  }
//			}
		//Method Overloading 
			//static int plusMethod(int x, int y) {
//		  return x + y;
//	}
//
//	static double plusMethod(double x, double y) {
//	  return x + y;
//	}
//
//	public static void main(String[] args) {
//	  int myNum1 = plusMethod(8, 5);
//	  double myNum2 = plusMethod(4.3, 6.26);
//	  System.out.println("int: " + myNum1);
//	  System.out.println("double: " + myNum2);
//	}
//Recursion 
//		//public class MyClass {
//		  public static void main(String[] args) {
//			    int result = sum(10);
//			    System.out.println(result);
//			  }
//			  public static int sum(int k) {
//			    if (k > 0) {
//			      return k + sum(k - 1);
//			    } else {
//			      return 0;
//			    }
//			  }
//			}
//Halting
//		public class MyClass {
//			  public static void main(String[] args) {
//			    int result = sum(5, 10);
//			    System.out.println(result);
//			  }
//			  public static int sum(int start, int end) {
//			    if (end > start) {
//			      return end + sum(start, end - 1);
//			    } else {
//			      return end;
//			    }
//			  }
//			}
//Input
		
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
		
		
//Data Types _ Variables = Data Values/ Declare
		
//128		byte b = Byte.parseByte(str);
//30(000)	short s = Short.parseShort(str);
//2(3*000)	int i = Integer.parseInt(str);
//9(6*000)	long l = Long.parseLong(str);
//7dig		float f = Float.parseFloat(str);
//15dig		double d = Double.parseDouble(str);
//f/t	 	boolean boo;
		
//			char ch;
			//str.charAt(1),str.indexOf("a")
//			String str;
			//str.length(),str.toUpperCase(), str.toLowerCase(),str1.concat(str2)
		
		
		//Cast 		
			//byte b = Byte.parseByte(str);double d = b;
			//byte b = Byte.parseByte(str);double d = (double)b;
		
		//Math
			//Math.max(x,y)
			//Math.min(x,y)
			//Math.sqrt(x)
			//Math.random()
		
//Operators
	
		//Arithmetics: +, -, *,/, %
		//Assignment: =,
		//ShortAssignment - Compound:-=,+=,*=,/=
		
		//ConditionalStatements
			//EqualityOperator: ==,!= //turns t/f
			//ComparisionOperator: <,>,<=,>= and str1.equals(str2),str1.compareTo(str2.toLowerCase()) //turns t/f
			//LogicalOperators: &&(and),||(or),^(exclusiveor),!(flips)//turns t/f
		
		//IfStatement
			//if(boolean variable,boolean comparison operator, any method expressing t/f) {execute/donotexecute} //
			//if(){execute, if t}else{execute,if f}
			//if(){execute, if t and skip others, donot execute, if f and move to else if }else if(){execute, if t and skip others, donot execute, if f and move to else }else{execute}

		//SwitchStatementCases
			//switch(expression) {case 1:break(if break, then skip others );case2:break;default:break;}

//Loops/Repetition
		
		//While condition: t -> executing While condition f-> stop executing
			//while(i >0){print(i);i++;(stops)}
		//While Loop: condition - updates
			//while(i>0){sum+= i;i = sc.nextInt();(updates)}
		//Do While: updates - condition
			//do{i = sc.nextInt();sum+= i;}while(i>0);
		//For: intializer - condition -iterator
			//for ( int c = 0; c<=10; c++){print(c)}
		//Break operator: control
			//for ( int c = 0; c<=10; c++){print(c);if(c==4)}{break;}}
			//for ( int c = 0; c<=10; c++){ for ( int cc = 0; cc<=10; cc++){print(i);if(i==4)}{break;}}print()}
			//while (i < 10) {System.out.println(i); i++; if (i == 4) {  break; }}
		//Continue operator:Control 
			//for ( int c = 0; c<=10; c++){if(i==4)}{continue;}print(i);}
			//while (i < 10) {if (i == 4) {i++;continue;}System.out.println(i);i++;}
			
//Arrays	
		
//declare	int[]i = new int[10];
//declare 	int[]i = new int[]{1,2,5,40}; String[]s = new String[]{"aba","baba"}; int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
//size		int.length;
//find el.	int[]ii = i[10]; int[]ii = i[i.length-1];int x = myNumbers[1][2];
//change el.int[2] = 4; 
		
		
		//For 
			//for(int index = 0; index< s.legth; index++){ String ss = s[index];printf(index,ss);}
			//char[] ch ={'a','b'};
				//for (int i = ch.length -1; i>=0;i--);{printf(i, ch[i]);}
			//int[] nums = new int[]{1,2,5,40}; 
				//for (int i = 0; i <nums.length;i+=2);{printf(i, nums[i]);}
		//Nested For
			//int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
				//for (int i = 0; i < myNumbers.length; ++i) {for(int j = 0; j < myNumbers[i].length; ++j) {System.out.println(myNumbers[i][j]); } }}}
		
		//For Each
			//int[] nums = new int[]{1,2,5,40}; 
				//for(int number:nums){println(number);}
		// Input 
			//Scanner sc = new Scanner(System.in), String str = sc.nextLine();int count = Integer.parseInt(str), int[]arr = new int[count];
				//for (int i = 0; i< arr.length;i++);{arr[i] = Integer.parseint(sc.nextLine());}
			//Scanner sc = new Scanner(System.in),String str = sc.nextLine(),String[] elements = str.split(""), int[]numbers  = new int[elements.length]
				//for(int i = 0; i< elements.length;i++){numbers[i] = Integer.parseint(elements[i]);}
		//Output
			//String[]s = new String[]{"aba","baba"}; 
				//for(int i=0;i<s.length;i++){println(s[i]);}
				//for (String ss:s){println(s);}
		//Joined
			//String joined = String.join(", ","aba","baba");println(joined);
			//int [] numbers = {1,2,3};String[] numbersasstring =new String[numbers.length];
				//for (int i=0;i<numbers.length;i++){numbersasstring[i] = integer.toString(numbers[i]);}String output = String.join(", ",numbersasstring);println(output);
				 
		
//Output
		
//		System.out.printf(format,argument);
		//format symbols: %c,%d,%f,%s,%n
		//escape sequences:\n,\r,\t,\b,\f
		
//		System.out.print(argument);
//		System.out.println(argument);
		
		

	}

}
