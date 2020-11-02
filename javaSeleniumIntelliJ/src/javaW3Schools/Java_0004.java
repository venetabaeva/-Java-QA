/**
 * 
 */
package javaW3Schools;

import java.util.Arrays;

/**
 * @author venetabaeva
 * String 
 */
public class Java_0004 {
	
		static String myString0001 = "The quick brown fox jumps over a lazy dog.";
		static String myString0002 = "The quick brown fox jumps over a lazy frog.";
		CharSequence charSeq = myString0002; 
		static String myString0003 = "He\'s \"topic\". / and \\";
		static String myString0004 = "The\t quick brown fox\n jumps\r over\f a lazy dog.";//Tab//New Line//Carriage Returns // Form Feed
		
		static char [] myChar0001 = {'q','u', 'i','c','k'};
		static String myString0005 = "";
		char [] myChar0002 = new char[]{ ' ', ' ', ' ', ' ', ' '};
		
		static char[] myChar0003 = myString0002.toCharArray();
		
		static String myString0006 = "quick";
		
		static CharSequence mycharSeq0001 = "neu";
		static CharSequence mycharSeq0002 = "mau";
		
		static String [] myString0007 = myString0002.split("a",2);//Splits a string into an array of substrings
		
		static byte[] myByte0001 = myString0002.getBytes();
		
		
	/**
	 * @param args
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		System.out.println(myString0001.length());
		System.out.println(myString0001.indexOf("c"));
		System.out.println(myString0002.indexOf('n',5));
		System.out.println(myString0002.intern());
		System.out.println(myString0002.lastIndexOf('n'));
		System.out.println(myString0002.lastIndexOf('n', 2));
		System.out.println(myString0002.lastIndexOf('n'));
		System.out.println(myString0001.charAt(5));
		System.out.println(myString0001.compareTo(myString0002));
		System.out.println(myString0001.compareToIgnoreCase(myString0002));
		System.out.println(myString0001.concat(myString0002));
		System.out.println(myString0001.contains(myString0002));
		System.out.println(myString0001.contentEquals(myString0002));
		System.out.println(myString0001.contentEquals(myString0001));
		System.out.println(myString0001.endsWith("."));
		System.out.println(myString0001.endsWith("non"));
		System.out.println(myString0001.equals(myString0001));
		System.out.println(myString0001.equals(myString0002));
		System.out.println(myString0002.equalsIgnoreCase(myString0001));
		System.out.println(myString0002.equalsIgnoreCase(myString0003));
		System.out.println(myString0002.format(myString0001));
		System.out.println(myString0001.isBlank());
		System.out.println(myString0001.isEmpty());
		System.out.println(myString0001.toCharArray());
		System.out.println(myString0001.toLowerCase());
		System.out.println(myString0001.toUpperCase());
		System.out.println(myString0001.getClass());
		System.out.println(myString0002.matches("The quick brown fox jumps over a lazy frog."));
		System.out.println(myString0002.matches("The quick brown fox jumps over a lazy dog."));
		System.out.println(myString0002.replace('d', 'f'));
		System.out.println(myString0002.startsWith("A"));
		System.out.println(myString0002.subSequence(0,5));
		System.out.println(myString0002.substring(3, 7));
		
		System.out.println(myString0003);
		
		System.out.println(myString0004);
	
		System.out.println(myString0005.copyValueOf(myChar0001));

		myString0006.getChars(0, 5, myChar0001, 0);
		System.out.println(myChar0001);
		
		for(char charSeq0004: myChar0003){
			System.out.println(charSeq0004); }
		
		System.out.println(myString0002.hashCode());
		
		System.out.println(myString0002.indexOf('n'));
		
		System.out.println(myString0002.replace(mycharSeq0001,mycharSeq0002));
		
		System.out.println(myString0002.replaceFirst("The", "A"));
		System.out.println(myString0002.replaceAll("A", "b"));
	
		
		 for (String myString0008: myString0007) 
	            System.out.println(myString0008); 
		 
		 System.out.println(myString0002.trim()); 
		  
		 System.out.println(Arrays.toString(myByte0001));
	}

}
