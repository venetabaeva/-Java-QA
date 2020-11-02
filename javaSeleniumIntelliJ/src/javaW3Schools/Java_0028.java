/**
 * 
 */
package javaW3Schools;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author venetabaeva
 * Date & Time
 */
public class Java_0028 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate myDate0001 = LocalDate.now();//represents a date (year, month, day (yyyy-MM-dd))
	      System.out.println(myDate0001); 
	    
	    LocalTime myTime0001 = LocalTime.now();//represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
	    System.out.println(myTime0001); 

	    LocalDateTime myDateTime0001 = LocalDateTime.now();//represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
	    System.out.println(myDateTime0001);
	    
	    LocalDateTime myDateTime0002 = LocalDateTime.now();//use the DateTimeFormatter class with the ofPattern() method in the same package to format or parse date-time objects. 
	    System.out.println("Before formatting: " + myDateTime0002);
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");//The ofPattern() method accepts all sorts of values, if you want to display the date and time in a different format. 

	    String myString0001 = myDateTime0002.format(myFormatObj);
	    System.out.println("After formatting: " + myString0001);
	    
	}

}
