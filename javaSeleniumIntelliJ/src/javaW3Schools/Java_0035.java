/**
 * 
 */
package javaW3Schools;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



/**
 * @author venetabaeva
 * Lambda Expression
 	* used in method that has a parameter with a single-method interface as its type
 	* called through the interface's method
 */

interface StringFunction {
	  String run(String str);
	}

public class Java_0035 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringFunction exclaim = (s) -> s + "!";
	    StringFunction ask = (s) -> s + "?";
	    printFormatted("Hello", exclaim);
	    printFormatted("Hello", ask);
	}
	    
	public static void printFormatted(String str, StringFunction format) {
		    String result = format.run(str);
		    System.out.println(result);
	
		    File myObj = new File("filename.txt"); // specify the filename

	        if (myObj.canRead())// checks if the specified file can be read or not
	            System.out.println("Can be Read");
	        else
	            System.out.println("Cannot be Read");
	        
	        if (myObj.canWrite())//tests whether the file is writable or not
	            System.out.println("Can be Read");
	        else
	            System.out.println("Cannot be Read");
	        
	        
	        try { 
	        	  
	            File myObj0001 = new File("F:\\program.txt"); // gets the file 
	  
	            if (myObj0001.createNewFile()) //creates an empty file
	                System.out.println("File created"); 
	            else
	                System.out.println("File already exists"); 
	        } catch (Exception e) { 
	            System.err.println(e); 
	        } 
	        
	        
	        try { 
	      	  
	            File myObj0003 = new File("F:\\program.txt"); // gets the file 
	  
	        	if (myObj0003.delete()) //deletes a file
	        		System.out.println("File created"); 
	        	else
	        		System.out.println("File already exists"); 
		  	} catch(Exception e) { 
		  			System.err.println(e); 
		  		} 
	        
	        try { 
	        	  
	
	            File myObj0003 = new File("F:\\program.txt"); 

	        	if (myObj0003.exists()) //creates an empty file
	        		System.out.println("File created"); 
	        	else
	        		System.out.println("File already exists"); 
	        	 String name = myObj0003.getName();//returns the name of the file
	        	 System.out.println(name);
	        	 
	        	 String name0001 = myObj0003.getAbsolutePath();//returns the absolute pathname of the file
	        	 System.out.println(name0001);
	        	 
	        	 long name0003 = myObj0003.length();
	        	 System.out.println(name0003);//returns the size of the file in bytes
	        	 
	        	 String[] name0004 = myObj0003.list();
	        	 System.out.println(name0004);//returns an array of the files in the directory
	        	 
	        	 boolean name0005 = myObj0003.mkdir();
	        	 System.out.println(name0005);//creates a directory
	        	 
		  	} catch(Exception e) { 
		  			System.err.println(e); 
		  		} 
	        
	        //creates file
	        try {
			      File myObj0001 = new File("filename.txt");
			      if (myObj0001.createNewFile()) {
			        System.out.println("File created: " + myObj0001.getName());
			      } else {
			        System.out.println("File already exists.");
			      }
		    } catch (IOException e) {
		        System.out.println("An error occurred.");
		        e.printStackTrace();
		      }
	        
	        //writes some text to  file
	        try {
		        FileWriter myWriter = new FileWriter("filename.txt");
		        myWriter.write("Files in Java might be tricky, but it is fun enough!");
		        myWriter.close();
		        System.out.println("Successfully wrote to the file.");
		      } catch (IOException e) {
		          System.out.println("An error occurred.");
		          e.printStackTrace();
		        }
	        
	        //read the contents of  text file
	        
	        try {
		        File myObj0002 = new File("filename.txt");
		        Scanner myReader = new Scanner(myObj0002);
		        while (myReader.hasNextLine()) {
		          String data = myReader.nextLine();
		          System.out.println(data);
		        }
		        myReader.close();
		      } catch (FileNotFoundException e) {
		        System.out.println("An error occurred.");
		        e.printStackTrace();
		      }
	        
	        //gets more information about a file
	        
	        File myObj0003 = new File("filename.txt");
	        if (myObj0003.exists()) {
	  	      System.out.println("File name: " + myObj0003.getName());
	  	      System.out.println("Absolute path: " + myObj0003.getAbsolutePath());
	  	      System.out.println("Writeable: " + myObj0003.canWrite());
	  	      System.out.println("Readable " + myObj0003.canRead());
	  	      System.out.println("File size in bytes " + myObj0003.length());
	  	    } else {
	  	      System.out.println("The file does not exist.");
	  	    }
	        
	        //deletes file in Java 
	        
	        if (myObj.delete()) { 
	  	      System.out.println("Deleted the file: " + myObj.getName());
	  	    } else {
	  	      System.out.println("Failed to delete the file.");
	  	    } 
	  	    //delete a folder. However, it must be empty
	  	    if (myObj.delete()) { 
	  	        System.out.println("Deleted the folder: " + myObj.getName());
	  	    } else {
	  	        System.out.println("Failed to delete the folder.");
	  	      } 
	}

}
