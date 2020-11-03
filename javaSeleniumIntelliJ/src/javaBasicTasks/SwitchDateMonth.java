package javaBasicTasks;

import java.util.Scanner;

public class SwitchDateMonth {
	static Scanner sc;
	static String input;
	static String m;
	static int d;
	
	
	/*
	 * displays the name of the season associated with a given date and month
	 * determine the season's start and end dates
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 sc = new Scanner(System.in);
		 m = sc.nextLine();
		 d = Integer.parseInt(sc.nextLine());
		 
		 
		 
		switch (m) {
		case "January":
			if ( d <= 31 || d>=1) {
				System.out.println("Winter");
			} 
			break;
		case "February":
			if ( d <= 28 || d>=1) {
				System.out.println("Winter");
			} 
			break;
		case "March":
			if ( d <= 20 && d>=20) {
				System.out.println("Winter");
			} else {
				System.out.println("Spring");
			}
			break;
		case "April":
			if (d <= 30 || d>=1) {
				System.out.println("Spring");
			} 
			break;
		case "May":
			if (d <= 31 || d>=1) {
				System.out.println("Spring");
			} 
			break;
		case "June":
			if (d <= 21 && d>=21) {
				System.out.println("Spring");
			} else {
				System.out.println("Summer");
			}
			break;
		case "July":
			if (d <= 31 || d>=1) {
				System.out.println("Summer");
			} 
			break;
		case "August":
			if (d <= 31 || d>=1) {
				System.out.println("Summer");
			} 
			break;
		case "September":
			if (d <= 22 && d>=22) {
				System.out.println("Summer");
			} else {
				System.out.println("Autumn");
			}
			break;
		case "October":
			if (d <= 31 || d>=1) {
				System.out.println("Autumn");
			} 
			break;
		case "November":
			if (d <= 30 || d>=1) {
				System.out.println("Autumn");
			} 
			break;
		case "December":
			if (d <= 21 && d>=21) {
				System.out.println("Autumn");
			} else {
				System.out.println("Winter");
			}
			break;
	}

}
	}
