/**
 * 
 */
package javaW3Schools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author venetabaeva
 * Regular Expression
 	* a sequence of characters that forms a search pattern
 	* a search pattern describes what you are searching for
 	* can be a single character, or a more complicated pattern
 	* performs all types of text search and text replace operations
 	* java.util.regex package 
 		* Pattern Class -> defines a pattern (to be used in a search)
 		* Matcher Class -> used to search for the pattern
 		* PatternSyntaxException Class -> indicates syntax error in a regular expression pattern
 */
public class Java_0031 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern myPattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
	    Matcher myMatcher = myPattern.matcher("Visit W3Schools!");
	    boolean matchFound = myMatcher.find();
	    if(matchFound) {
	        System.out.println("Match found");
	    } else {
	      System.out.println("Match not found");
	    }


	}

}
